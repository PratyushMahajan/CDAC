const express = require('express');
const { getJobs, createJob, updateJob, deleteJob } = require('../controllers/job_list_controller');

//router object
const router =  express.Router();

//routes
// GET ALL JOB LIST || GET
router.get('/getall', getJobs);

// CREATE JOB || POST
router.post('/create', createJob);

// UPDATE JOB || PUT
router.put('/update/:id', updateJob);

// DELETE JOB || DELETE
router.delete('/delete/:id', deleteJob);

module.exports = router;