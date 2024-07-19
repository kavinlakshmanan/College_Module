document.getElementById('assignment-form').addEventListener('submit', function(event) {
    event.preventDefault();

    const title = document.getElementById('title').value;
    const description = document.getElementById('description').value;
    const dueDate = document.getElementById('due-date').value;

    const assignmentList = document.getElementById('assignment-list');
    const newAssignment = document.createElement('li');
    newAssignment.innerHTML = `Title: ${title}, Description: ${description}, Due Date: ${dueDate} <button class="remove-btn">Remove</button>`;
    
    assignmentList.appendChild(newAssignment);

    // Add event listener to the remove button
    newAssignment.querySelector('.remove-btn').addEventListener('click', function() {
        assignmentList.removeChild(newAssignment);
    });

    document.getElementById('assignment-form').reset();
});

// Dummy function for analysis and report content
function generateReport() {
    const reportDiv = document.getElementById('report');
    reportDiv.innerHTML = '<p>Analysis and report content will be dynamically generated here.</p>';
}

// Call the function to generate the report content when the page loads
window.onload = generateReport;
