document.addEventListener("DOMContentLoaded", () => {

    const jobForm = document.querySelector("form");
    const jobID = document.getElementById("jobid");
    const role = document.getElementById("role");
    const company = document.getElementById("company");
    const location = document.getElementById("location");
    const skills = document.getElementById("skills");
    const eligibility = document.getElementById("eligibility");
    const lastDate = document.getElementById("lastdate");
    const ctc = document.getElementById("ctc");

    jobForm.addEventListener("submit", async (e) => {
        e.preventDefault(); 
        
        const jobData = {
            Job_ID: jobID.value,
            Role: role.value,
            Company: company.value,
            Location: location.value,
            Primary_Skills: skills.value,
            Eligibility: eligibility.value,
            LastDateToApply: lastDate.value,
            CTC: ctc.value
        };

        try {
            const response = await fetch('http://localhost:8800/api/v1/jobs/create', {
                method: 'POST',
                headers: {
                    'Content-Type': 'application/json'
                },
                body: JSON.stringify(jobData)
            });

            const data = await response.json();

            if (response.ok) {
                alert("Job posted successfully!");
                jobForm.reset();
            } else {
                alert(`Error: ${data.message}`);
            }
        } catch (error) {
            console.error("Error submitting form:", error);
            alert("There was an error submitting the form.");
        }
    });
});
