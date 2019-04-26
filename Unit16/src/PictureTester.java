/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
	
  public static void testZeroBlue()
  {
    Picture beach = new Picture("C:\\Users\\pratapa1028\\Desktop\\Unit16-Assignments-pixLab-20190417T181620Z-001\\Unit16-Assignments-pixLab\\images\\water.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("C:\\Users\\pratapa1028\\Desktop\\Unit16-Assignments-pixLab-20190417T181620Z-001\\Unit16-Assignments-pixLab\\images\\caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("C:\\Users\\pratapa1028\\Desktop\\Unit16-Assignments-pixLab-20190417T181620Z-001\\Unit16-Assignments-pixLab\\images\\temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMirrorVerticalRighttToLeft()
  {
	  Picture caterpillar = new Picture("src\\imagez\\caterpillar.jpg");
	    caterpillar.explore();
	    caterpillar.mirrorVerticalRightToLeft();
	    caterpillar.explore();
  }
  public static void testMirrorHorizontalBotToTop() 
  {
	  Picture beach = new Picture("C:\\Users\\pratapa1028\\Desktop\\Unit16-Assignments-pixLab-20190417T181620Z-001\\Unit16-Assignments-pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.mirrorHorizontalBotToTop();
	    beach.explore();
	  
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture beach = new Picture("C:\\Users\\pratapa1028\\Desktop\\Unit16-Assignments-pixLab-20190417T181620Z-001\\Unit16-Assignments-pixLab\\images\\beach.jpg");
	    beach.explore();
	    beach.mirrorDiagonal();
	    beach.explore();
  }
  
  public static void testMirrorArms()
  {
	  Picture snowman = new Picture("C:\\Users\\pratapa1028\\Desktop\\Unit16-Assignments-pixLab-20190417T181620Z-001\\Unit16-Assignments-pixLab\\images\\snowman.jpg");
	    snowman.explore();
	    snowman.mirrorArms();
	    snowman.explore();
  }

  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	//testMirrorVerticalRighttToLeft();
	//testMirrorVertical();
	//testMirrorHorizontalBotToTop();
	//testMirrorDiagonal();
   
  }

private static void testGrayscale() {
	// TODO Auto-generated method stub
	Picture temple = new Picture("C:\\\\Users\\\\pratapa1028\\\\Desktop\\\\Unit16-Assignments-pixLab-20190417T181620Z-001\\\\Unit16-Assignments-pixLab\\\\images\\\\temple.jpg");
	  temple.explore();
	  temple.grayscale();
	  temple.explore();
}

private static void testNegate() {
	// TODO Auto-generated method stub
	 Picture temple = new Picture("C:\\\\Users\\\\pratapa1028\\\\Desktop\\\\Unit16-Assignments-pixLab-20190417T181620Z-001\\\\Unit16-Assignments-pixLab\\\\images\\\\temple.jpg");
	  temple.explore();
	  temple.negate();
	  temple.explore();
}

private static void testKeepOnlyGreen() {
	// TODO Auto-generated method stub
	 Picture temple = new Picture("C:\\\\\\\\Users\\\\\\\\pratapa1028\\\\\\\\Desktop\\\\\\\\Unit16-Assignments-pixLab-20190417T181620Z-001\\\\\\\\Unit16-Assignments-pixLab\\\\\\\\images\\\\\\\\temple.jpg");
	  temple.explore();
	  temple.modifyColors(0, 1, 0);;
	  temple.explore();
}

private static void testKeepOnlyRed() {
	// TODO Auto-generated method stub
	 Picture temple = new Picture("C:\\\\\\\\Users\\\\\\\\pratapa1028\\\\\\\\Desktop\\\\\\\\Unit16-Assignments-pixLab-20190417T181620Z-001\\\\\\\\Unit16-Assignments-pixLab\\\\\\\\images\\\\\\\\temple.jpg");
	  temple.explore();
	  temple.modifyColors(1, 0, 0);
	  temple.explore();
}

private static void testKeepOnlyBlue() {
	// TODO Auto-generated method stub
	 Picture temple = new Picture("src/temple.jpg");
	  temple.explore();
	  temple.keepOnlyBlue();
	  temple.explore();
}

private static void testFixUnderwater() {
	// TODO Auto-generated method stub
	Picture beach = new Picture("C:\\Users\\pratapa1028\\Desktop\\Unit16-Assignments-pixLab-20190417T181620Z-001\\Unit16-Assignments-pixLab\\images\\water.jpg");
    beach.explore();
    beach.modifyColors(3, .9, .9);
    beach.explore();
}


}