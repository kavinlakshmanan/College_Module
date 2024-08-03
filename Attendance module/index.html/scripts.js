document.addEventListener('DOMContentLoaded', function() {
    const attendanceForm = document.getElementById('attendance-form');
    const attendanceDataSection = document.getElementById('attendance-data');
    const attendanceTableBody = document.getElementById('attendance-table-body');
    const closeButton = document.getElementById('close-button');

    attendanceForm.addEventListener('submit', function(event) {
        event.preventDefault();
        
        const department = document.getElementById('department').value;
        const classSection = document.getElementById('class-section').value;

        // Simulate fetching attendance data
        const attendanceData = fetchAttendanceData(department, classSection);

        // Display the attendance data
        displayAttendanceData(attendanceData);
    });

    closeButton.addEventListener('click', function() {
        attendanceDataSection.classList.add('hidden');
    });

    function fetchAttendanceData(department, classSection) {
        // This function simulates fetching attendance data based on department and class section
        // In a real application, this data would come from a server

        return [
            { id: 'S001', name: 'John Doe', attendance: 'Present' },
            { id: 'S002', name: 'Jane Smith', attendance: 'Absent' },
            { id: 'S003', name: 'Alice Johnson', attendance: 'Present' },
            { id: 'S004', name: 'Bob Brown', attendance: 'Present' }
        ];
    }

    function displayAttendanceData(data) {
        attendanceTableBody.innerHTML = ''; // Clear any previous data

        data.forEach(record => {
            const row = document.createElement('tr');
            const attendanceStatus = record.attendance === 'Present' ? '✔️ Present' : '✖️ Absent';
            const attendanceClass = record.attendance === 'Present' ? 'present' : 'absent';
            row.innerHTML = `
                <td>${record.id}</td>
                <td>${record.name}</td>
                <td class="${attendanceClass}">${attendanceStatus}</td>
            `;
            attendanceTableBody.appendChild(row);
        });

        attendanceDataSection.classList.remove('hidden');
    }
});
