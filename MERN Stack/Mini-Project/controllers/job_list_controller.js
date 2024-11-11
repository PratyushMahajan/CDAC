const db = require("../config/db");

// GET ALL JOB LIST
const getJobs = async(req, res) => {
    try {
        const data = await db.query('SELECT * from jobpost');
        if(!data) {
            return res.status(404).send({
                success:false,
                message:"No Records found",
            });
        }
        res.status(200).send({
            success:true,
            message:"All Job Records found",
            totalJobs: data[0].length,
            data: data[0]
        });
    }
    catch(error){
        console.log(error)
        res.status(500).send({
            success:false,
            message:"Error in Get All Jobs API",
            error
        });
    }
};

// CREATE JOB
const createJob = async(req, res) => {
    try {
        const {Job_ID, Role, Company, Location, Primary_Skills, Eligibility, LastDateToApply, CTC} = req.body;
        if(!Job_ID || !Role || !Company || !Location ||  !Primary_Skills || !CTC || !Eligibility || !LastDateToApply) {
            return res.status(500).send({
                success:false,
                message:"Please Provide all fields"
            });
        }
        const data = await db.query(`INSERT into jobpost (Job_ID, Role, Company, Location, Primary_Skills, Eligibility, LastDateToApply, CTC) VALUES (?,?,?,?,?,?,?,?)`,[Job_ID, Role, Company, Location, Primary_Skills, Eligibility, LastDateToApply, CTC]);
        if(!data) {
            return res.status(404).send({
                success:false,
                message:"Error in insert query"
            });
        }
        res.status(201).send({
            success:true,
            message:"New Job Record Created"
        });
    }
    catch(error) {
        console.log(error);
        res.status(500).send({
            success:false,
            message:"Error in creating job API",
            error
        });
    }
};

// UPDATE JOB
const updateJob = async(req, res) => {
    try {
        const jobid = req.params.id;
        if(!jobid) {
            return res.status(404).send({
                success:false,
                message:"Invalid ID or Provide ID"
            });
        }
        const {Role, Company, Location, Primary_Skills, Eligibility, LastDateToApply, CTC} = req.body;
        const query = `UPDATE jobpost SET Role = ?, Company = ?, Location = ?, Primary_Skills = ?, Eligibility = ?, LastDateToApply = ?, CTC = ? WHERE Job_ID = ?`;

        const data = await db.query(query, [Role, Company, Location, Primary_Skills, Eligibility, LastDateToApply, CTC, jobid]);
        if(!data){
            return res.status(500).send({
                success:false,
                message:"Error in update data"
            });
        }
        res.status(200).send({
            success:true,
            message:"Job Details updated"
        });
    }
    catch(error) {
        console.log(error);
        res.status(500).send({
            success:false,
            message:"Error in update job record",
            error
        });
    }
};

// DELETE JOB
const deleteJob = async(req, res) => {
    try {
        const jobid = req.params.id;
        if(!jobid) {
            return res.status(404).send({
                success:false,
                message:"Invalid ID or Provide ID"
            }); 
        }
        await db.query(`DELETE from jobpost WHERE Job_ID = ?`, [jobid]);
        res.status(200).send({
            success:true,
            message:"Job Record Deleted"
        });
    }
    catch(error) {
        console.log(error);
        res.status(500).send({
            success:false,
            message:"Error in deleting job API",
            error
        });
    }
};

module.exports = {getJobs, createJob, updateJob, deleteJob};