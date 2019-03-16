module.exports = {
    devServer: {
        proxy: {
            '^/': {      // '/'로 들어오는 모든 요청이 target으로 redirection 된다. ** matches any path, all requests will be proxied.
                target: 'http://localhost:8080/'       // 개발서버 (target host) 
                ,ws: false               // proxy websockets
                ,changeOrigin:true      // needed for virtual hosted sites
                //,publicPath: './'     // deploy root path
                

            }
        }
    },
    //assetsDir: '',
    //outputDir: 'dist'
}