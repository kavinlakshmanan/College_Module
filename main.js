document.getElementById('department-name').addEventListener('input', function() {
    const input = this.value.toLowerCase();
    const list = document.getElementById('department-list');
    const items = list.getElementsByTagName('li');

    list.classList.remove('hidden');

    Array.from(items).forEach(item => {
        const text = item.textContent.toLowerCase();
        if (text.includes(input)) {
            item.style.display = '';
        } else {
            item.style.display = 'none';
        }
    });
});

function selectDepartment(department) {
    document.getElementById('department-name').value = department;
    document.getElementById('department-list').classList.add('hidden');
}

document.addEventListener('click', function(event) {
    const departmentNameInput = document.getElementById('department-name');
    const departmentList = document.getElementById('department-list');

    if (!departmentNameInput.contains(event.target) && !departmentList.contains(event.target)) {
        departmentList.classList.add('hidden');
    }
});
