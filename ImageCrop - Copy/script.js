const canWidth = 500;

let input = document.getElementById("input");

input.addEventListener("change", (event) => {
  let image_file = event.target.files[0];

  //   console.log(image_file);



  let reader = new FileReader();

  reader.readAsDataURL(image_file);

  reader.onload = (event) => {
    let image_url = event.target.result;

    let image = document.createElement("img");

    image.src = image_url;

    let originalImage=document.createElement("img");

    originalImage.src=image_url;

    document.getElementById("container").appendChild(originalImage);


    image.onload = (e) => {
      let canvas = document.createElement("canvas");

      let aspectRatio = canWidth / e.target.width;

      canvas.width = canWidth;

      //To maintain aspect ratio

      canvas.height = e.target.height * aspectRatio;

      const context = canvas.getContext("2d");

      context.drawImage(image, 0, 0, canvas.width, canvas.height);

      let new_image_url = context.canvas.toDataURL("image/jpeg", 80);

      let new_image = document.createElement("img");

      new_image.src = new_image_url;

      document.getElementById("container").appendChild(new_image);
    };
  };
});
