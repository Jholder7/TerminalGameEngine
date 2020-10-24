# Welcome to the Wiki
### This wiki page will hold hold simple tutorials and all documentation so far of the engine. Please feel free to request a pull if you would like to edit, or better explain the documentation.

<br />

## Next Steps
* Start with [Getting Stated](#getting-stated) section.
* [Engine Documentation](#engine-documentation)

<br />
<br />

## Getting Stated
  This tutorial assumes you have:
* JDK installed [download here](https://www.oracle.com/java/technologies/javase/jdk14-archive-downloads.html) (Recommended version: 14.0.1 or compile source code with your chosen version of JDK)
* Basic knowledge of Java
* **OPTIONAL** Your preferred IDE

<br />

### **Setting Up**
First you must navigate to the [TermGame Download](https://github.com/Jholder7/TerminalGameEngine) and download the latest release of the engine. It will download as a zip file, you must unzip the file and place the `TermGame` folder in your active working directory. **The previous method is recommended**; however, if you prefer to use a dependency management system please like [HERE](#a-slightly-advanced-getting-started)

<br />

### **Writing Your First Game**
First the engine library must be in the active coding directory, along with the controller class file. The Directory should have the following hierarchy:

<pre>[Working Directory]
     └─ ExampleProgram.java <-- Controller Class
     └─ TermGame            <-- Engine Library</pre>

As seen above in this example we will be working with a controller class file named `ExampleProgram.java`. The next step should be creating the file `ExampleProgram.java` and setting up the main class as seen below:


```java
import TermGame.*; // <-- Must have the engine imported

public class ExampleProgram{

    public static main(String[] args){

    }

}
```

After we have set up the controller class file we need to create a window. To create a window we must use the `Window` classes static method `.createWindow(String title, int width, int height)`. We can add this code to the controller class file as seen below:
```java
import TermGame.*; // <-- Must have the engine imported

public class ExampleProgram{

    public static main(String[] args){

        // Creates a window with the title "Example Title," with a width and height of 100x100
        Window gameWindow = Window.createWindow("Example Title", 100, 100);

    }

}
```
>The above code when ran will create a blank window titled "Example Title", try it!

<br />
<br />

## A Slightly Advanced Getting Started 
**This section will be filled out later, for know please user the simple  method.**

<br />
<br />

# Engine Documentation
Below is all current documentation of the latest release of the Engine, if you are experienced please feel free to avoid recommendations in documentation. If you are using an **Unstable Release** it is best to refer to the incode documentation of your version via comments.
> -Justin Holder (My Development Moto)

<br />

## Window Class:
The Window class hold all methods relating the window. This Class has many rapper methods meant to make interfacing simpler is do desired.
* ### **Create Window**
  Static method used for creating the game window, only one Window can ever be instanced at once. A class object of Window should ***NEVER*** be instance with `new ` instead this method should be used. This method returns a n object reference which should be stored in a Window object: ```Window gameWindow = Window.createWindow("ExampledTitle", 1, 1)```
  ```java
  Window.createWindow(String title, int width, int height)
  ```
  * `title` a String object that will display as the window title
  * `width` in pixels of the window frame
  * `height` in pixels of the window frame
* ### **Add Viewport**:
  Used to add a viewport to the current window, which is used to show the world. Without a viewport the game world is not visible. It has ***not been tested***, but should allow swapping of active Viewports. It is recommended however that only **one** viewport should be used, as potential buffer issues are a problem if not handled properly.
  ```Java
  .addViewport(Viewport viewport)
  ```
  * `viewport` an instanced Viewport object 