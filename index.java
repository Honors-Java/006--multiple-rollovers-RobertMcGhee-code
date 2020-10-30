void setup() {
	size(400, 400);
}

void draw() {
	background(255);
	stroke(0);

  //start creating the lines
  line(0, 200, 400, 200);
  line(200, 0, 200, 400);
  //Fill a black color
  if (mouseX < width/2 && mouseY < height/2){
  fill(0);
  rect(0, 0, 200, 200);
  }else if(mouseX > width/2 && mouseY < height/2){
  fill(0);
  rect(200, 0, 200, 200);
  }else if(mouseX < width/2 && mouseY > height/2){
  fill(0);
  rect(0, 200, 200, 200);
  }else{
  fill(0);
  rect(200, 200, 200, 200);
  }
  //Build your conditional statement 
	

}