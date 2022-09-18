/*
 * This file is part of  Treasure Artifacts Loot Pack.
 * Copyright (c) 2021, Mark Gottschling (gottsch)
 * 
 * All rights reserved.
 *
 * Treasure Artifacts Loot Pack is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Treasure Artifacts Loot Pack is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with Treasure Artifacts Loot Pack.  If not, see <http://www.gnu.org/licenses/lgpl>.
 */
package mod.gottsch.forge.treasure_artifacts_lootpack;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.someguyssoftware.treasure2.api.TreasureApi;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

/**
 * 
 * @author Mark Gottschling on Sep 17, 2022
 *
 */
@Mod(value = TreasureArtifactsLP.MODID)
public class TreasureArtifactsLP {
	// constants
	public static final String MODID = "treasure2_artifacts_lp";
	protected static final String NAME = "Treasure2ArtifactsLP";
	
	// logger
	public static Logger LOGGER = LogManager.getLogger(TreasureArtifactsLP.NAME);

	public static TreasureArtifactsLP instance;

	/**
	 * 
	 */
    public TreasureArtifactsLP() {
    	TreasureArtifactsLP.instance = this;
    	
		// Register the setup method for modloading
		IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
		eventBus.addListener(this::common);
}

    /**
     * 
     * @param event
     */
	private void common(final FMLCommonSetupEvent event) {
		TreasureApi.registerLootTables(MODID);
	}
}
