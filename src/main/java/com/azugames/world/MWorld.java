package com.azugames.world;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.registry.GameRegistry;

public class MWorld {

	public static void mainRegistry(){
		initialiseWorldGen();
}
	public static void initialiseWorldGen (){
		registerWorldGen (new AzuOre(), 1);
	}
	public static void registerWorldGen(IWorldGenerator worldGenClass, int weightedProbability){
		GameRegistry.registerWorldGenerator(worldGenClass, weightedProbability);
	}
}