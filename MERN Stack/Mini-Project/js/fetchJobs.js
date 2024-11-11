const apiUrl = `http://localhost:8800/api/v1/jobs/getall`;

async function fetchJobs() {
    try {
        const response = await fetch(apiUrl);
        const result = await response.json();

        if (!result.success) {
            console.error('Error:', result.message);
            document.getElementById('jobResults').innerHTML = `<h2>No job records found.</h2>`;
            return;
        }

        const jobs = result.data;
        displayJobs(jobs);
    } catch (error) {
        console.error('Error fetching jobs:', error);
        document.getElementById('jobResults').innerHTML = `<p>Unable to fetch job records.</p>`;
    }
}

function displayJobs(jobs) {
    const jobResults = document.getElementById('jobResults');
    jobResults.innerHTML = '';

    if (jobs.length === 0) {
        jobResults.innerHTML = `<h2>No job listings found.</h2>`;
        return;
    }

    jobs.forEach((job) => {
        const jobCard = `
            <div class="col-md-6 mb-4">
                <div class="card shadow-sm">
                    <div class="card-body">
                        <h5 class="card-title">${job.Role} <span style="float: right;">CTC - ${job.CTC}</span></h5>
                        <h6 class="card-subtitle mb-2 text-muted">${job.Company} <span style="float: right;">Primary Skills:&nbsp ${job.Primary_Skills}</span></h6>
                        <p class="card-text">
                            <strong>Location:</strong> ${job.Location} <span style="float: right; color: green; font-weight:bold">Job ID: ${job.Job_ID}</span><br>
                            <strong>Criteria:</strong> ${job.Eligibility} <br>
                            <strong>Last Date to Apply:</strong> ${job.LastDatetoApply}
                            <span>
                                <a href="#" class="btn" style="color: #fff; float:right">Apply Now</a>
                            </span>
                        </p>
                    </div>
                </div>
            </div>
        `;
        jobResults.innerHTML += jobCard;
    });
}

document.addEventListener('DOMContentLoaded', fetchJobs);
