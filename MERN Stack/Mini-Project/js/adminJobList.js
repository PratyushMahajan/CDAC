const apiUrl = `http://localhost:8800/api/v1/jobs/getall`;

async function fetchJobs() {
    try {
        const response = await fetch(apiUrl);
        const result = await response.json();

        if (!result.success) {
            console.error('Error:', result.message);
            document.getElementById('jobs-list').innerHTML = `<h2>No job posted.</h2>`;
            return;
        }

        const jobs = result.data;
        displayJobs(jobs);
    } catch (error) {
        console.error('Error fetching jobs:', error);
        document.getElementById('jobs-list').innerHTML = `<p>Unable to fetch job records.</p>`;
    }
}

function displayJobs(jobs) {
    const jobResults = document.getElementById('jobs-list');
    jobResults.innerHTML = '';

    if (jobs.length === 0) {
        jobResults.innerHTML = `<h2>No job posted.</h2>`;
        return;
    }

    jobs.forEach((job) => {
        const jobCard = `
            <tr class="text-center" id="job-row-${job.Job_ID}">
                <td>${job.Job_ID}</td>
                <td>${job.Role}</td>
                <td>${job.Company}</td>
                <td>${job.Location}</td>
                <td>${job.Primary_Skills}</td>
                <td>${job.Eligibility}</td>
                <td>${job.CTC}</td>
                <td>${job.LastDatetoApply}</td>
                <td>
                    <button class="btn" style="background-color:orange" onclick="editJob('${job.Job_ID}')">Edit</button>
                    <button class="btn" style="background-color:red" onclick="deleteJob('${job.Job_ID}')">Delete</button>
                </td>       
            </tr>               
        `;
        jobResults.innerHTML += jobCard;
    });
}

async function editJob(jobId) {
    const apiUrl = `http://localhost:8800/api/v1/jobs/get/${jobId}`;
    try {
        const response = await fetch(apiUrl);
        const result = await response.json();

        if (!result.success || !result.jobDetails) {
            alert("Failed to fetch job details.");
            return;
        }

        const job = result.jobDetails;

        const updatedRole = prompt("Enter Role:", job.Role);
        const updatedCompany = prompt("Enter Company:", job.Company);
        const updatedLocation = prompt("Enter Location:", job.Location);
        const updatedSkills = prompt("Enter Primary Skills:", job.Primary_Skills);
        const updatedEligibility = prompt("Enter Eligibility:", job.Eligibility);
        const updatedCTC = prompt("Enter CTC:", job.CTC);
        const updatedLastDate = prompt("Enter Last Date to Apply:", job.LastDatetoApply);

        const updateData = {
            Role: updatedRole,
            Company: updatedCompany,
            Location: updatedLocation,
            Primary_Skills: updatedSkills,
            Eligibility: updatedEligibility,
            CTC: updatedCTC,
            LastDateToApply: updatedLastDate
        };

        await updateJob(jobId, updateData);
    } catch (error) {
        console.error('Error fetching job details:', error);
        alert("An error occurred while fetching job details.");
    }
}

async function updateJob(jobId, updateData) {
    const updateUrl = `http://localhost:8800/api/v1/jobs/update/${jobId}`;

    try {
        const response = await fetch(updateUrl, {
            method: 'PUT',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(updateData)
        });

        const result = await response.json();

        if (result.success) {
            alert("Job details updated successfully!");
            fetchJobs();
        } else {
            alert("Failed to update job details: " + result.message);
        }
    } catch (error) {
        console.error('Error updating job:', error);
        alert("An error occurred while updating the job.");
    }
}

async function deleteJob(jobId) {
    const deleteUrl = `http://localhost:8800/api/v1/jobs/delete/${jobId}`;

    const confirmDelete = confirm("Are you sure you want to delete this job?");
    if (!confirmDelete) return;

    try {
        const response = await fetch(deleteUrl, {
            method: 'DELETE',
            headers: {
                'Content-Type': 'application/json'
            }
        });

        const result = await response.json();

        if (result.success) {
            alert("Job record deleted successfully!");

            const jobRow = document.getElementById(`job-row-${jobId}`);
            if (jobRow) {
                jobRow.remove();
            }
        } else {
            alert("Failed to delete job record: " +result.message);
        }
    } catch (error) {
        console.error('Error deleting job:',error);
        alert("An error occurred while deleting the job.");
    }
}


document.addEventListener('DOMContentLoaded', fetchJobs);