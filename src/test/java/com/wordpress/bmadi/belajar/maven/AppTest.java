package com.wordpress.bmadi.belajar.maven;

import junit.framework.Assert;

public class AppTest {
    
    public void testTambah(){
        App app = new App();
        Integer harusnya = 5;
        // Check hasilnya
        Assert.assertTrue(harusnya.equals(app.tambah(2, 3)));
    }
}
