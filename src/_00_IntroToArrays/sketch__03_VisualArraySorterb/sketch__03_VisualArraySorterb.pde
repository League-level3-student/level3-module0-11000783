/* Copy the code into a new Processing sketch and complete then steps. */

//1. create an array of ints. don't initialize it yet.
int [] numbers;

void setup() {
  //2. set the size of your window
  size(200, 200);

  //3. initialize your array with the built in width variable
numbers = new int[200];
  
  //4. initialize the ints in the array with random numbers
  //   from 0 to the built in height variable
  for(int i=0; i < 200; i++ ){
    int randNum = (int)random(200);
    numbers[i] = randNum;
  }

  //5. call the noStroke() method
  noStroke();
}

void draw() {
  //6. set the background color with background(r, g, b);
background(40,40,40);

  //7. set the color for your graph
color c = color(204, 320, 10);

  //8. draw a rectangle for each int in your array.
  //   the x value will be the index of the int
  //   the y value will the height variable
  //   the width is 1
  //   the height is negative the value of the int at that element in the array
for(int i = 0; i < numbers.length; i++){
fill(c);
rect(i, 200, 1, -numbers[i]);
// -randNum[i]
}
  //9. call the stepSort method
  stepSort(numbers);
  if(mousePressed){
    randomize();
  }
}
  //10. extract the code that randomizes the array into a method.
  void randomize(){
    for(int i=0; i < 200; i++ ){
    int randNum = (int)random(200);
    numbers[i] = randNum;
  }
  }

  //11. call the method you made in step 10 when the mouse is pressed
  


void stepSort(int[] arr) {
  for (int i = 1; i < arr.length; i++) {
    if (arr[i - 1] > arr[i]) {
      int t = arr[i];
      arr[i] = arr[i - 1];
      arr[i - 1] = t;
    }
  }
}
