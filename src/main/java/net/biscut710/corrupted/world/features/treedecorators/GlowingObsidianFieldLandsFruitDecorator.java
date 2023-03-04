package net.biscut710.corrupted.world.features.treedecorators;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator;

public class GlowingObsidianFieldLandsFruitDecorator extends CocoaDecorator {
    public static final GlowingObsidianFieldLandsFruitDecorator INSTANCE = new GlowingObsidianFieldLandsFruitDecorator();
    public static com.mojang.serialization.Codec<GlowingObsidianFieldLandsFruitDecorator> codec;
    public static TreeDecoratorType<?> tdt;
    static {
        codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);
        tdt = new TreeDecoratorType<>(codec);
        ForgeRegistries.TREE_DECORATOR_TYPES.register("glowing_obsidian_field_lands_tree_fruit_decorator", tdt);
    }
    public GlowingObsidianFieldLandsFruitDecorator() {
        super(0.2f);
    }
    @Override protected TreeDecoratorType<?> type() {
        return tdt;
    }
    @Override /* failed to load code for net.minecraft.world.level.levelgen.feature.treedecorators.CocoaDecorator */
}
