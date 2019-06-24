class UserGist extends React.Component {
    constructor(props) {
        super(props)
        this.state = {
            isLoaded: false,
            id: -1,
            name: '',
            description: '',
            openTime: '',
            url: '',
            qqNum: '',
            serviceMasterUserId: -1,
            type: ''


        }

    }

    componentDidMount() {
        // fetch(this.props.source, {
        //     method: "POST", mode: "cors",//可以在这设置跨域
        //     headers: {
        //         "Content-Type": "application/x-www-form-urlencoded"
        //     }
        // }).then((result) => {
        //     result.json().then((data) => {
        //         console.log("pages =", data);
        //         this.setState({
        //             isLoaded: true,
        //             pages: data.data
        //         });
        //     })
        //
        // });
    }

    handleSubmit(event) {
        event.preventDefault(); //阻止表单默认提交
        var forms = this.props.form;
        if (!this.state.value) {
            alert('提交内容不能为空！');
            return;
        }
        ;
        alert('Submit text is ' + this.state.value); //这里可以写入ajax代码

    }

    handleName(e) {
        this.state = {name:e.target.value}
    }
    handleUrl(e) {
        this.state = {url:e.target.value}
    }
    handleDescription(e) {
        this.state = {description:e.target.value}
    }
    handleOpenTime(e) {
        this.state = {openTime:e.target.value}
    }
    handleQqNum(e) {
        this.state = {qqNum:e.target.value}
    }


    render() {
        return (
            <div>
                <form border="1" action="#" method='post' onSubmit={this.handleSubmit.bind(this)}>
                    {/*<input  name="id" type="text" value={this.state.id} />*/}
                    <label> 名称: <input name="name" type="text" maxLength="16" ref="name" onChange={this.handleName.bind(this)}/> </label><br/>
                    <label>网站地址: <input name="name" type="text" maxLength="32" ref="url" onChange={this.handleUrl.bind(this)}/> </label><br/>
                    <label>描述: <input name="name" type="text" maxLength="16" ref="description" onChange={this.handleDescription.bind(this)}/> </label><br/>
                    <label>开服时间: <input name="name" type="text" ref="openTime" onChange={this.handleOpenTime.bind(this)}/> </label><br/>
                    <label>qq群: <input name="name" type="text" maxLength="16" ref="qqNum" onChange={this.handleQqNum.bind(this)}/> </label><br/>
                    <input name="sub" type="submit"/>

                </form>
            </div>
        );

    }


}

ReactDOM.render(
    <UserGist source=""/>,
    document.getElementById('root')
);