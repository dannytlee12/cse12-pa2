/**
 * TODO: Add your file header
 * Name:Danny Lee
 * ID:A17209209
 * Email:dtl001@ucsd.edu
 * Sources used: Zybooks
 * Some example of sources used would be Tutors, Zybooks, and Lecture Slides
 *
 * 2-4 sentence file description here
 this is a class implentation of the data structure ArrayList
 */

 /**
 * TODO: Add your implementation of MyArrayList here
 */
public class MyArrayList implements MyList {
  Object[] data;
  int size;

  public MyArrayList(){

  }

  public MyArrayList(int initialCapacity){

  }

  public MyArrayList(E[] arr){

  }

  public void expandCapacity(int requiredCapacity){
    if(requiredCapacity < data.length){
      throw IllegalArgumentException;
    }
    Object[] newdata;
    if(data.length == 0){
      newdata = new Object[requiredCapacity];
      return;
    }
    while(data.length < requiredCapacity){
      newdata = new Object[data.length*2];
    }
    for(int i=0; i<size;i++){
      newdata[i] = data[i];
    }
    data = newdata;
  }

  public int getCapacity(){
    return data.length;
  }

  public void insert(int index, E element){
    if(index < 0 || index > size){
      throw IndexOutOfBoundsException;
    }
    if(size = this.getCapacity()){
      this.extendCapacity(this.getCapacity+1);
    }

    for(int i=size;i>index;i--){
      data[i+1] = data[i]
    }
    data[index] = element;
    size++;

  }

  public void append(E element){
    if(size = this.getCapacity()){
      this.extendCapacity(this.getCapacity+1);
    }

    data[size] = element;
    size++;
  }

  public void prepend(E element){
    this.insert(0,element);
    size++;
  }

  public E get(int index){
    if(index < 0 || index > size){
      throw IndexOutOfBoundsException;
    }
    return data[index];
  }

  public E set(int index, E element){
    if(index < 0 || index > size){
      throw IndexOutOfBoundsException;
    }
    data[index] = element;
  }

  public E remove(int index){
    if(index < 0 || index > size){
      throw IndexOutOfBoundsException;
    }
    for(int i = index; i<size;i++){
      data[i]=data[i+1];
    }
    size--;
  }

  public int size(){
    return size;
  }
}
 // Hint: the 'capacity' (length of data array) is not the same as the 'size'
 // Size is the number of elements in the ArrayList, i.e., the number of valid elements in the array
