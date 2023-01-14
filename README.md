## Pool Area

### Description

The Swimming Company has asked you to write an application that calculates the volume of cuboid shaped pools.

1. Write a class with the name <b>Rectangle</b>. The class needs two fields (instance variable) with name <b>width</b> and <b>length</b> both of type <b>double</b>. The class needs to have one constructor with parameters <b>width</b> and <b>length</b> both of type <b>double</b> and it needs to initialize the fields. In case the <b>width</b> parameter is less than 0 it needs to set the <b>width</b> field value to 0. In case the <b>length</b> parameter is less than 0 it needs to set the <b>length</b> field value to 0.<br><br>Write the following methods (instance methods):

<ul>
<li>Method named <b>getWidth</b> without any parameters, it needs to return the value of <b>width</b> field.</li>
<li>Method named <b>getLength</b> without any parameters, it needs to return the value of <b>length</b> field.</li>
<li>Method named <b>getArea</b> without any parameters, it needs to return the calculated area (width * length).</li>
</ul>

2. Write a class with the name <b>Cuboid</b> that extends <b>Rectangle</b> class. The class needs one field (instance variable) with name <b>height</b> of type <b>double</b>. The class needs to have one constructor with three parameters <b>width</b>, <b>length</b>, and <b>height</b> all of type <b>double</b>. It needs to call parent constructor and initialize a <b>height</b> field. In case the <b>height</b> parameter is less than 0 it needs to set the <b>height</b> field value to 0.<br><br>Write the following methods (instance methods):

<ul>
</li>Method named <b>getHeight</b> without any parameters, it needs to return the value of <b>height</b> field.</li>
</li>Method named <b>getVolume</b> without any parameters, it needs to return the calculated volume. To calculate volume multiply the area with height.</li>
</ul>

### Test Code

    Rectangle rectangle = new Rectangle(5, 10);
    System.out.println("rectangle.width= " + rectangle.getWidth());
    System.out.println("rectangle.length= " + rectangle.getLength());
    System.out.println("rectangle.area= " + rectangle.getArea());
    Cuboid cuboid = new Cuboid(5,10,5);
    System.out.println("cuboid.width= " + cuboid.getWidth());
    System.out.println("cuboid.length= " + cuboid.getLength());
    System.out.println("cuboid.area= " + cuboid.getArea());
    System.out.println("cuboid.height= " + cuboid.getHeight());
    System.out.println("cuboid.volume= " + cuboid.getVolume());
    
### Output

    rectangle.width= 5.0
    rectangle.length= 10.0
    rectangle.area= 50.0
    cuboid.width= 5.0
    cuboid.length= 10.0
    cuboid.area= 50.0
    cuboid.height= 5.0
    cuboid.volume= 250.0
