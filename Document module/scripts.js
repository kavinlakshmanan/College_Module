document.addEventListener('DOMContentLoaded', function() {
    const videoContainer = document.getElementById('video-container');

    // Array of video URLs
    const videos = [
        'https://panimalar.ac.in/assets/video/PEC-Homepage.mp4',
        'https://panimalar.ac.in/assets/video/PEC-Homepage.mp4',
        'https://panimalar.ac.in/assets/video/PEC-Homepage.mp4'
    ];

    // Function to create video elements
    function addVideos() {
        videos.forEach(url => {
            const videoItem = document.createElement('div');
            videoItem.classList.add('video-item');
            videoItem.innerHTML = `<iframe src="${url}" allowfullscreen></iframe>`;
            videoContainer.appendChild(videoItem);
        });
    }

    // Handle form submission
    document.getElementById('upload-form').addEventListener('submit', function(event) {
        event.preventDefault();
        
        const file = document.getElementById('file').files[0];
        const expiryDate = document.getElementById('expiry-date').value;

        if (file && expiryDate) {
            alert(`File: ${file.name}\nExpiry Date: ${expiryDate}`);
        }
    });

    // Add videos to the gallery
    addVideos();
});
