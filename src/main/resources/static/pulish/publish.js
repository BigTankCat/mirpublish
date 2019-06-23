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
        this.like = function (id) {
            alert(id);
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


    render() {
        return (
            <div>
                <form border="1">
                    <label> 名称: <input name="name" type="text"/> </label>
                    <label>网站地址: <input name="name" type="text"/> </label>
                    <label>描述: <input name="name" type="text"/> </label>
                    <label>开服时间: <input name="name" type="text"/> </label>
                    <label>评价: <input name="name" type="text"/> </label>
                    <label>qq群: <input name="name" type="text"/> </label>
                </form>
            </div>
        );

    }
}

ReactDOM.render(
    <UserGist source="/getPublishInfo"/>,
    document.getElementById('root')
);