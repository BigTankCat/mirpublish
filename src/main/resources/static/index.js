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

    }

    componentDidMount() {
        fetch(this.props.source, {
            method: "POST", mode: "cors",//可以在这设置跨域
            headers: {
                "Content-Type": "application/x-www-form-urlencoded"
            }
        }).then((result) => {
            result.json().then((data) => {
                console.log("pages =", data);
                this.setState({
                    isLoaded: true,
                    pages: data
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
                        <th>网站地址</th>
                        <th>qq群</th>

                    </tr>
                    {this.state.pages.map((value, index) => {
                        var urlJump;
                        if (value.url.startsWith("http")) {
                            urlJump = value.url;
                        } else {
                            urlJump = "http://" + value.url;
                        }
                        return (
                            <tr key={index} id={value.id}>
                                <td>{value.name}</td>
                                <td>{value.desc}</td>
                                <td>{value.openTime}</td>
                                <td><a href={urlJump} target="_blank">{value.url}</a></td>
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
                    <UserGist source="http://localhost:8080"/>,
                    document.getElementById('root')
                    );