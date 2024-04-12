const base = {
    get() {
        return {
            url : "http://localhost:8080/springboot74z37/",
            name: "springboot74z37",
            // 退出到首页链接
            indexUrl: 'http://localhost:8080/springboot74z37/front/index.html'
        };
    },
    getProjectName(){
        return {
            projectName: "网上蛋糕商城系统"
        } 
    }
}
export default base
