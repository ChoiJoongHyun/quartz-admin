const webpack = require('webpack');

module.exports = {
    devtool: 'inline-source-map',
    devServer: {
        historyApiFallback: true,
        publicPath: '/static/',
        host: "0.0.0.0",
        port: 3001,
        proxy: {
            "**": "http://localhost:8091"
        }
    },
    plugins: [
        new webpack.NamedModulesPlugin()
    ]
};
