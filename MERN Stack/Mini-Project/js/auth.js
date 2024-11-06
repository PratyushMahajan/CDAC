let users = JSON.parse(localStorage.getItem("users")) || [];
let employers = JSON.parse(localStorage.getItem("employers")) || [];

function signUpUser(email, password) {
    const existingUser = users.find(user => user.email === email);
    if (existingUser) {
        alert("User already exists. Please sign in.");
        return;
    }

    const user = { email, password };
    users.push(user);
    localStorage.setItem("users", JSON.stringify(users));
    alert("Job Seeker sign-up successful. You can now sign in.");
    window.location.href = "job-seeker-login.html";
}

function signUpEmployer(email, password) {
    const existingEmployer = employers.find(employer => employer.email === email);
    if (existingEmployer) {
        alert("Employer already exists. Please sign in.");
        return;
    }

    const employer = { email, password };
    employers.push(employer);
    localStorage.setItem("employers", JSON.stringify(employers));
    alert("Employer sign-up successful. You can now sign in.");
    window.location.href = "employer-login.html";
}

function signInUser(email, password) {
    const user = users.find(user => user.email === email && user.password === password);
    if (user) {
        alert("Job Seeker sign-in successful!");
        window.location.href = "index.html";
    } else {
        alert("Invalid email or password. Please try again.");
    }
}

function signInEmployer(email, password) {
    const employer = employers.find(employer => employer.email === email && employer.password === password);
    if (employer) {
        alert("Employer sign-in successful!");
        window.location.href = "employer-home.html"; 
    } else {
        alert("Invalid email or password. Please try again.");
    }
}

const jsSignupForm = document.getElementById("js-signup-form");
if (jsSignupForm) {
    jsSignupForm.addEventListener("submit", event => {
        event.preventDefault();
        const email = document.getElementById("js-signup-email").value;
        const password = document.getElementById("js-signup-password").value;
        const confirmPassword = document.getElementById("js-signup-confirmpassword").value;

        if (password !== confirmPassword) {
            alert("Passwords do not match. Please try again.");
            return;
        }
        
        signUpUser(email, password);
        jsSignupForm.reset();
    });
}

const jsSigninForm = document.getElementById("js-login-form");
if (jsSigninForm) {
    jsSigninForm.addEventListener("submit", event => {
        event.preventDefault();
        const email = document.getElementById("js-login-email").value;
        const password = document.getElementById("js-login-password").value;
        signInUser(email, password);
        jsSigninForm.reset();
    });
}

const emSignupForm = document.getElementById("em-signup-form");
if (emSignupForm) {
    
    emSignupForm.addEventListener("submit", event => {
        event.preventDefault();
        const email = document.getElementById("em-signup-email").value;
        const password = document.getElementById("em-signup-password").value;
        const confirmPassword = document.getElementById("em-signup-confirmPassword").value;

        if (password !== confirmPassword) {
            alert("Passwords do not match. Please try again.");
            return;
        }

        signUpEmployer(email, password);
        emSignupForm.reset();
    });
}

const emSigninForm = document.getElementById("em-login-form");
if (emSigninForm) {
    emSigninForm.addEventListener("submit", event => {
        event.preventDefault();
        const email = document.getElementById("em-login-email").value;
        const password = document.getElementById("em-login-password").value;
        signInEmployer(email, password);
        emSigninForm.reset();
    });
}
