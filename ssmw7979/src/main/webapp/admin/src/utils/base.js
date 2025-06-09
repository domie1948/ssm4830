const base = {
    get() {
                return {
            url : "http://localhost:8080/ssmw7979/",
            name: "ssmw7979",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/ssmw7979/front/index.html'
        };
            },
    getProjectName(){
        return {
            projectName: "生鲜供应平台"
        } 
    }
}
export default base
