document.addEventListener('DOMContentLoaded', function() {

const images = document.getElementsByClassName("menu-item-image");
const modal = document.querySelector(".modal");
const modalImg = document.querySelector(".modalImg");
const modalTxt = document.querySelector(".modalTxt");
const close = document.querySelector(".close");

// console.log(Object.values(images));
// console.log(images)

    Array.from(images).forEach((image) => {
        console.log(image)
        console.log(modalImg)
        image.addEventListener('click', (e) => {
            e.preventDefault();
            modalImg.src = image.src;
            modalTxt.innerHTML = image.alt;
            modal.classList.add("appear");
            console.log("Image clicked!");

            close.addEventListener("click", (e) => {
                e.preventDefault();
                modal.classList.remove("appear");
            });
        });
    });

});

// function imageModal() {
//     images.forEach((image) => {
//         image.addEventListener("click", () => {
//             modalImg.src = image.src;
//             modalTxt.innerHTML = image.alt;
//             modal.classList.add("appear");
//             console.log("Image clicked!")
//             close.addEventListener("click", () => {
//                 modal.classList.remove("appear");
//             })
//         });
//     });
// };    