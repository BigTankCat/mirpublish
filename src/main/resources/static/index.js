class UserGist extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            isLoaded: false,
            pages: [{
                id: 0,
                name: '',
                desc: '',
                openTime: '',
                url: '',
                qqNum: ''
            }]
        }
        this.appraise = function (id,url) {

            fetch(url, {
                method: "POST", mode: "cors",//可以在这设置跨域
                body: JSON.stringify({
                    "id": id
                })
            }).then(function(res){
                if(res.ok){
                    res.json().then(function(data){
                        console.log("pages =", data);
                        alert("评价成功")
                    })
                }else{
                    alert("系统异常，请稍后再试")
                }
            }, function(e){
                alert("系统异常，请稍后再试")
            })


        }

    }

    componentDidMount() {
        fetch(this.props.source, {
            method: "POST", mode: "cors",//可以在这设置跨域
            headers: {
                "Content-Type": "application/x-www-form-urlencoded"
            }
        }).then((result) => {
            result.json().then((data) => {
                this.setState({
                    isLoaded: true,
                    pages: data.data
                });
            })

        });


    }


    render() {
        return (
            <div>
                <table border="1" class="default-table">
                    <tbody>
                    <tr>
                        <th>名称</th>
                        <th>描述</th>
                        <th>时间</th>
                        <th>评价</th>
                        <th>qq群</th>

                    </tr>
                    {this.state.pages.map((value, index) => {
                        let urlJump;
                        if (value.url.startsWith("http")) {
                            urlJump = value.url;
                        } else {
                            urlJump = "http://" + value.url;
                        }
                        let voteDetail = "/voteDetail?id="+value.id;

                        return (
                            <tr key={index} id={value.id}>
                                <td><a href={urlJump} target="_blank">{value.name}</a></td>
                                <td>{value.desc}</td>
                                <td>{value.openTime}</td>
                                <td>
                                    <div onClick={this.appraise.bind(this, value.id,"/publishInfo/like")} style={{float:'left'}}><img src="/pic/like/like.png" height="20" width="20" />  10</div>
                                    &nbsp;&nbsp;&nbsp;
                                    <div onClick={this.appraise.bind(this, value.id,"/publishInfo/unLike")} style={{float:'left'}}><img src="/pic/like/unlike.png" height="20" width="20" /> 20</div>
                                    <a href={voteDetail}  target="_blank">评价详情</a>
                                </td>
                                <td>{value.qqNum}</td>
                            </tr>
                        )
                    })}
                    </tbody>
                </table>
            </div>
        );
    }
}

ReactDOM.render(
    <UserGist source="/getPublishInfo"/>,
    document.getElementById('root')
);