
let images = document.getElementById("img1");

for (let i = 0; i < images.length; i++) {
  images[i].addEventListener('click', function() {
    document.body.style.backgroundImage = "url('" + this.src + "')";
  });
}