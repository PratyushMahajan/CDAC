const express = require('express');
const colors = require('colors');
const morgan = require('morgan');
const dotenv = require('dotenv');
const mySQLPool = require('./config/db');
const cors = require('cors');

//configure dotenv
dotenv.config();

//rest object
const app = express();


//middlewares
app.use(morgan('dev'));
app.use(express.json());
app.use(cors());
app.use(express.static('public'));

//routes
app.use('/api/v1/jobs', require("./routes/job_portal_routes"));

app.get('/test', (req, res) => {
    res.status(200).send('<h1>Nodejs MySQL</h1>');
});

//port
const PORT = process.env.PORT || 8000;

mySQLPool.query("SELECT 1")
    .then(() => {
        console.log('MySQL DB Connected'.bgCyan.white);

        // Start server after DB connection is successful
        app.listen(PORT, () => {
            console.log(`Server Running on ${PORT}`.bgMagenta.white);
        });
    })
    .catch((error) => {
        console.log('Error connecting to MySQL DB:', error);
    });


