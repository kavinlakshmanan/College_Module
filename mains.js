// main.js
document.addEventListener("DOMContentLoaded", function() {
    var form = document.getElementById('login-form');
    
    form.addEventListener('submit', function(event) {
        var departmentName = document.getElementById('department-name').value.trim();
        var password = document.getElementById('password').value.trim();

        if (departmentName === "") {
            alert("Please enter a Department Name.");
            event.preventDefault(); // Prevent form submission
            return false;
        }

        if (password === "") {
            alert("Please enter a Password.");
            event.preventDefault(); // Prevent form submission
            return false;
        }

        // If validation is successful, form will be submitted normally
    });
});

function selectDepartment(department) {
    document.getElementById('department-name').value = department;
    document.getElementById('department-list').classList.add('hidden');
}
