package TermGame;

import javax.swing.JFrame;

public class Window extends JFrame {

    // Static Variable
    static Window currentInstance = null; // <-- Holds the single reference instance to the window.

    // Private Variable
    private String windowTitle;
    private int windowWidth;
    private int windowHeight;
    private Viewport mainViewport = null;
    private KeyListener keyboard = new KeyListener();

    // Public Variables (Future)


    public Window(String title, int width, int height){

        // Set private variables
        this.windowTitle = title;
        this.windowWidth = width;
        this.windowHeight = height;

        //Set up the JFrame window
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle(windowTitle);
        setSize(windowWidth, windowHeight);
        setLocationRelativeTo(null);
        addKeyListener(keyboard); // <-- This wont work for some reason
        setResizable(true); // <-- For our use we do not want it to resizable

    }


    /**
     * <h1>Create Window</h1>
     * 
     * <p>
     * This static method creates the window, once created the window
     * should be store in a reference object. The reference object
     * should be used to interface with the engine. 
     * 
     * @param title Title of the window.
     * @param width Width of the window in pixels.
     * @param height Height of the window in pixels.
     * @return <b>Window</b> object reference.
     */
    public static Window createWindow(String title, int width, int height){

        // Check if there is already an active instance
        if (currentInstance == null){

            Window currentInstance = new Window(title, width, height); // Creates the instance
            return currentInstance;

        }
        else{ 
            throw new IllegalStateException("A Window Already Exists!!!"); // <-- Throws an exception if more then one window is attempted to be created
        }

    }


    /**
     * <h1>Add Viewport</h1>
     * 
     * <p>
     * This method adds a Viewport to the current window. Though it has
     * not been tested, this method should allow swapping between
     * active Viewport. 
     * 
     * @param viewport Instantiate and use a Viewport object.
     */
    public void addViewport(Viewport viewport){

        mainViewport = viewport; // <-- sets the instance object reference of the window
        getContentPane().add(viewport.getViewport()); // <-- adds the viewport the the JFrame window

    }


    /**
     * <h1>Get Main Viewport</h1>
     * 
     * <p>
     * Simple method for returning the currently private active 
     * viewport. Should be used to instance the active viewport 
     * if a reference wasn't already stored.
     * 
     * <p>
     * <b>Future Note:</b> This method will allow data protection,
     * and is here to return low level viewport when higher level
     * are stacked on.
     * 
     * @return <b>Viewport</b>
     */
    public Viewport getMainViewport(){

        return mainViewport; // <-- Returns the private active viewport

    }
    

    /**
     * <h1>Repack Window</h1>
     * 
     * <p>
     * Will repack the window to make sure the current Viewport will fit
     * hopefully this will be changed to be handle backend in the future. 
     * For now this method is provided.
     * 
     */
    public void repackWindow(){

        pack(); // <-- repack the JFrame
        setVisible(true); // <-- Shows thw window
        //FIXME Find a better means of handling this. 

    }


    /**
     * <h1>Get Key Listener</h1>
     * 
     * <p>
     * Will allow interfacing with the active KeyListener of the
     * window.
     * 
     * @return
     */
    public KeyListener getKeyListener(){

        return keyboard;
        //FIXME Find a better means of Handling this.

    }
    
}
