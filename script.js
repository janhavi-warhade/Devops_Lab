function validateForm() {

    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let mobile = document.getElementById("mobile").value.trim();
    let department = document.getElementById("department").value;
    let comments = document.getElementById("comments").value.trim();
    let gender = document.querySelector('input[name="gender"]:checked');

    let emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    let mobilePattern = /^[0-9]{10}$/;

    if (name === "") {
        alert("Name cannot be empty");
        return false;
    }

    if (!email.match(emailPattern)) {
        alert("Invalid Email");
        return false;
    }

    if (!mobile.match(mobilePattern)) {
        alert("Invalid Mobile Number");
        return false;
    }

    if (!gender) {
        alert("Select gender");
        return false;
    }

    if (department === "") {
        alert("Select department");
        return false;
    }

    let wordCount = comments.split(/\s+/).length;
    if (wordCount < 10) {
        alert("Feedback must be at least 10 words");
        return false;
    }

    alert("Form submitted successfully!");
    return true;
}