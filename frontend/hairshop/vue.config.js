// module.exports = {
//     devServer: {
//         proxy: {
//             '/api': {      // 로 들어오는 모든 요청이 아래 target으로 redirection 된다.
//                 target: 'http://localhost:8080/api',       // 개발서버
//                 ws: true,
//                 changeOrigin: true,
//                 pathRewrite: {
//                     '^/api': ''
//                 }
//             }
//         }
//     },
//     outputDir: 'target/dist',
//     assetsDir: 'static'
// }

module.exports = {
    devServer: {
        proxy: {
            '/': {      // '/'로 들어오는 모든 요청이 target으로 redirection 된다.
                target: 'http://localhost:8080/',       // 개발서버    
                ws: true,
                changeOrigin:true
            }
        }
    }
}