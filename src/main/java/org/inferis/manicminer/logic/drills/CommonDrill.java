package org.inferis.manicminer.logic.drills;

import org.inferis.manicminer.ManicMiner;

import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CommonDrill extends DrillBase {

    public CommonDrill(World world, ServerPlayerEntity player) {
        super(world, player);
    }

    @Override
    public boolean canHandle(String blockId) {
        return ManicMiner.CONFIG.allowCommonBlocks && (
            blockId.equals("minecraft:stone") || blockId.equals("minecraft:deepslate") ||
            blockId.equals("minecraft:granite") || blockId.equals("minecraft:andesite") || blockId.equals("minecraft:diorite") ||
            blockId.equals("minecraft:gravel") || blockId.equals("minecraft:tuff") ||
            blockId.equals("minecraft:netherrack") || blockId.equals("minecraft:basalt") || blockId.equals("minecraft:blackstone") || 
            blockId.equals("minecraft:hardened_clay") || blockId.equals("minecraft:stained_hardened_clay") ||
            blockId.equals("minecraft:sandstone") || blockId.equals("minecraft:sand") || 
            blockId.equals("minecraft:soulsand") || blockId.equals("minecraft:soulsoil") || 
            blockId.equals("minecraft:dirt") || blockId.equals("minecraft:clay")
        );
    }

    @Override
    public boolean drill(BlockPos blockPos) {
        _log("Common");
        return true;
    }
    
}
