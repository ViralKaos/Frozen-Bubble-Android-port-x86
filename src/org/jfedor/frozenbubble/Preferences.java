package org.jfedor.frozenbubble;

import android.content.SharedPreferences;

public class Preferences {

	static boolean adsOn      = true;
	static int     collision  = BubbleSprite.MIN_PIX;
	static boolean compressor = false;
	static int     difficulty = LevelManager.MODERATE;
	static boolean dontRushMe = false;
	static boolean fullscreen = true;
	static int     gameMode   = FrozenBubble.GAME_NORMAL;
	static boolean musicOn    = true;
	static boolean soundOn    = true;
	static int     targetMode = FrozenBubble.POINT_TO_SHOOT;
	
	public synchronized static boolean getAdsOn() {
	    return adsOn;
	  }
	public synchronized static void setAdsOn(boolean newAdsOn) {
	    adsOn = newAdsOn;
	  }
	public synchronized static boolean getAimThenShoot() {
	    return ((targetMode == FrozenBubble.AIM_TO_SHOOT) || (targetMode == FrozenBubble.ROTATE_TO_SHOOT));
	  }
	public synchronized static int getCollision() {
	    return collision;
	  }
	public synchronized static void setCollision(int newCollision) {
	    collision = newCollision;
	  }
	public synchronized static boolean getCompressor() {
	    return compressor;
	  }
	public synchronized static void setCompressor(boolean newCompressor) {
	    compressor = newCompressor;
	  }
	public synchronized static int getDifficulty() {
	    return difficulty;
	  }
	public synchronized static void setDifficulty(int newDifficulty) {
	    difficulty = newDifficulty;
	  }
	public synchronized static boolean getDontRushMe() {
	    return dontRushMe;
	  }
	public synchronized static void setDontRushMe(boolean dont) {
	    dontRushMe = dont;
	  }
	public synchronized static boolean getFullscreen() {
	    return fullscreen;
	  }
	public synchronized static  void setFullscreen(boolean newFullscreen) {
	    fullscreen = newFullscreen;
	  }
	public synchronized static int getMode() {
	    return gameMode;
	  }
	public synchronized static void setMode(int newMode) {
	    gameMode = newMode;
	  }
	public synchronized static boolean getMusicOn() {
	    return musicOn;
	  }
	public synchronized static void setMusicOn(boolean mo) {
	    musicOn = mo;
	  }
	public synchronized static boolean getSoundOn() {
	    return soundOn;
	  }
	public synchronized static void setSoundOn(boolean so) {
	    soundOn = so;
	  }
	public synchronized static int getTargetMode() {
	    return targetMode;
	  }
	public synchronized static void setTargetMode(int tm) {
	    targetMode = tm;
	  }
	public static void restorePreferences(SharedPreferences mConfig) {
		adsOn      = mConfig.getBoolean("adsOn",      true                 );
	    collision  = mConfig.getInt    ("collision",  BubbleSprite.MIN_PIX );
	    compressor = mConfig.getBoolean("compressor", false                );
	    difficulty = mConfig.getInt    ("difficulty", LevelManager.MODERATE);
	    dontRushMe = mConfig.getBoolean("dontRushMe", false                );
	    fullscreen = mConfig.getBoolean("fullscreen", true                 );
	    gameMode   = mConfig.getInt    ("gameMode",   FrozenBubble.GAME_NORMAL          );
	    musicOn    = mConfig.getBoolean("musicOn",    true                 );
	    soundOn    = mConfig.getBoolean("soundOn",    true                 );
	    targetMode = mConfig.getInt    ("targetMode", FrozenBubble.POINT_TO_SHOOT       );
	}

}
