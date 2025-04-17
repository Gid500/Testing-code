document
.getElementById("loginForm")
.addEventListener("submit", function (event) {
    event.preventDefault();
    const username = document.getElementById("username").value;
    const password = document.getElementById("password").value;

    const user = localStorage.getItem(username);

    if (user) {
    const parsedUser = JSON.parse(user);
    if (parsedUser.password === password) {
        localStorage.setItem("user", JSON.stringify(parsedUser));
        window.location.href = "index.html";
    } else {
        alert("Incorrect password");
    }
    } else {
    alert("User not found");
    }
});