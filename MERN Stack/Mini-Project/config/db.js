const mysql = require('mysql2/promise');

const mySQLPool = mysql.createPool({
    host: 'localhost',
    user: 'root',
    password: '06102002',
    database: 'job_portal'
});

module.exports = mySQLPool;