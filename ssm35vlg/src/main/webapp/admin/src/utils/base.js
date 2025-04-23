const base = {
    get() {
        return {
            url : "http://localhost:8080/ssm35vlg/",
            name: "ssm35vlg",
            // 退出到首页链接
            indexUrl: ''
        };
    },
    getProjectName(){
        return {
            projectName: "企业员工岗前培训管理系统"
        } 
    }
}
export default base
