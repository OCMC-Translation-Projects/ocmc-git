package org.ocmc.pols.git;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class JGitUtilsTest {
	static String username = "";
	static String pwd = "";
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		username = System.getenv("user");
		pwd = System.getenv("pwd");
	}

	@Test
	public void testPull() {
		String alwbPath = "/Users/mac002/Git/alwb-repositories/ages"; // ages only
		assertTrue(JGitUtils.pullAllGitRepos(alwbPath));
	}
	@Test
	public void testReset() {
		String alwbPath = "/Users/mac002/Git/alwb-repositories/ages"; // ages only
		assertTrue(JGitUtils.resetAllGitRepos(alwbPath));
	}
	@Test
	public void testPush() {
		String alwbPath = "/Users/mac002/Git/mcolburn/synch-test"; // ages only
		String message = "";
		assertTrue(JGitUtils.pushAllGitRepos(
				alwbPath
				, username
				, pwd
				, message
				));
	}

}
