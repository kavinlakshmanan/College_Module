let assignments = [];
let quizzes = [];
let students = [];

function addAssignment() {
    const assignmentInput = document.getElementById('assignmentInput').value;
    if (assignmentInput) {
        assignments.push(assignmentInput);
        updateAssignments();
        document.getElementById('assignmentInput').value = '';
    }
}

function updateAssignments() {
    const assignmentList = document.getElementById('assignmentList');
    assignmentList.innerHTML = '';
    assignments.forEach((assignment, index) => {
        const li = document.createElement('li');
        li.textContent = assignment;
        assignmentList.appendChild(li);
    });
}

function addQuiz() {
    const quizInput = document.getElementById('quizInput').value;
    if (quizInput) {
        quizzes.push(quizInput);
        updateQuizzes();
        document.getElementById('quizInput').value = '';
    }
}

function updateQuizzes() {
    const quizList = document.getElementById('quizList');
    quizList.innerHTML = '';
    quizzes.forEach((quiz, index) => {
        const li = document.createElement('li');
        li.textContent = quiz;
        quizList.appendChild(li);
    });
}

function markAttendance() {
    const studentName = document.getElementById('studentName').value;
    if (studentName) {
        students.push({ name: studentName, attended: true });
        updateAttendance();
        document.getElementById('studentName').value = '';
    }
}

function updateAttendance() {
    const attendanceList = document.getElementById('attendanceList');
    attendanceList.innerHTML = '';
    students.forEach((student, index) => {
        const li = document.createElement('li');
        li.textContent = `${student.name} - ${student.attended ? 'Attended' : 'Not Attended'}`;
        attendanceList.appendChild(li);
    });
    updateStatistics();
}

function updateStatistics() {
    const totalStudents = students.length;
    const passedStudents = students.filter(student => student.attended).length;
    const passPercentage = totalStudents ? (passedStudents / totalStudents) * 100 : 0;
    document.getElementById('passPercentage').textContent = `Pass Percentage: ${passPercentage.toFixed(2)}%`;
}

