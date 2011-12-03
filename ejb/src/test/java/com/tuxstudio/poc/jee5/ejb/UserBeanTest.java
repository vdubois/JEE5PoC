package com.tuxstudio.poc.jee5.ejb;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import javax.ejb.EJB;

import java.util.List;

/**
 *
 * @author Vincent Dubois <dubois.vct@free.fr>
 */
public class UserBeanTest {

	UserBean userComponent;

    public UserBeanTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void testList() {
        userComponent = new UserBean();
        assertNotNull(userComponent);
    }
}
