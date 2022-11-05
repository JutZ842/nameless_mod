package teamwu.underworld.init;

import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.dimension.DimensionType;
import teamwu.underworld.UnderWorldMod;


public class UWDimensions {

    public static final ResourceKey<Level> UNDERWORLD_DIMENSION_KEY = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(UnderWorldMod.MODID, "uw_dimension"));
    public static final ResourceKey<DimensionType> UNDERWORLD_DIMENSION_TYPE = ResourceKey.create(Registry.DIMENSION_TYPE_REGISTRY, UNDERWORLD_DIMENSION_KEY.getRegistryName());

    public static void register(){
        System.out.println("Registering dimension " + UnderWorldMod.MODID);
    }
}
