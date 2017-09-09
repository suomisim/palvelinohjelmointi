package h3t13.all;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import h3t13.kello.*;
import h3t13.laskin.*;

@RunWith(Suite.class)
@SuiteClasses({
	LaskinTest.class,
	SuomiKelloTest.class,
	GmtIsoKelloTest.class,
	InternetKelloLahdeTest.class
	})
public class AllTests {
}