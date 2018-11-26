package it.hurts.metallurgy_reforged.material;

import net.minecraft.block.Block;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraftforge.fluids.FluidRegistry;
import net.minecraftforge.registries.IForgeRegistry;

import java.util.ArrayList;
import java.util.List;

import static it.hurts.metallurgy_reforged.material.MetalStats.FluidStats;

public class ModMetals {
    public static List<Metal> metalList = new ArrayList<>();

    public static final Metal ADAMANTINE = new MetalStats("adamantine", "Adamantine", 2,
            new ArmorStats(new int[]{3, 4, 5, 3}, 8, 36, 3.5F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(22, 7, 1550, 10F, 8F), new FluidStats(0xFFa30000), 6).createMetal();
    public static final Metal ALDUORITE = new MetalStats("alduorite", "Alduorite", 2, null, null, new FluidStats(0xFF29AF9D), 3).createMetal();
    public static final Metal ANGMALLEN = new MetalStats("angmallen", "Angmallen", 2,
            new ArmorStats(new int[]{3, 5, 6, 3}, 18, 30, 0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(30, 3, 300, 7F, 6F), new FluidStats(0xFFF1E472), -1).createMetal();
    public static final Metal ASTRAL_SILVER = new MetalStats("astral_silver", "AstralSilver", 2,
            new ArmorStats(new int[]{2, 5, 6, 2}, 9, 15, 0.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(30, 5, 35, 12F, 5F), new FluidStats(0xFF70C4C4), 4).createMetal();
    public static final Metal ATLARUS = new MetalStats("atlarus", "Atlarus", 2,
            new ArmorStats(new int[]{4, 3, 3, 4}, 2, 35, 3.5F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(22, 7, 1750, 10F, 8F), new FluidStats(0xFFC0C601), 6).createMetal();
    public static final Metal AMORDRINE = new MetalStats("amordrine", "Amordrine", 2,
            new ArmorStats(new int[]{3, 4, 5, 3}, 50, 50, 2F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(50, 5, 500, 14F, 7F), new FluidStats(0xFFB981F1), -1).createMetal();
    public static final Metal BLACK_STEEL = new MetalStats("black_steel", "BlackSteel", 2,
            new ArmorStats(new int[]{3, 5, 6, 3}, 17, 50, 4F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(17, 3, 500, 8F, 6F), new FluidStats(0xFF010623), -1).createMetal();
    public static final Metal BRASS = new MetalStats("brass", "Brass", 2,
            new ArmorStats(new int[]{1, 2, 3, 2}, 18, 15, 4F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(18, 1, 15, 10F, 5F), new FluidStats(0xFFEAAB00), -1).createMetal();
    public static final Metal BRONZE = new MetalStats("bronze", "Bronze", 2,
            new ArmorStats(new int[]{3, 3, 4, 2}, 9, 25, 2F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(9, 3, 250, 6F, 5F), new FluidStats(0xFFFFB301), -1).createMetal();
    public static final Metal CARMOT = new MetalStats("carmot", "Carmot", 2,
            new ArmorStats(new int[]{2, 4, 5, 2}, 7, 28, 0.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(40, 5, 50, 12F, 5F), new FluidStats(0xFFE5D868), 4).createMetal();
    public static final Metal CELENEGIL = new MetalStats("celenegil", "Celenegil", 2,
            new ArmorStats(new int[]{4, 6, 7, 5}, 50, 160, 0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(50, 6, 1600, 14F, 7F), new FluidStats(0xFF86E51A), -1).createMetal();
    public static final Metal CERUCLASE = new MetalStats("ceruclase", "Ceruclase", 2, 
    		new ArmorStats(new int[]{3, 6, 5, 4}, 50, 137, 0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(18, 4, 500, 7, 7F), new FluidStats(0xFF4CA8E5), 3).createMetal();
    public static final Metal COPPER = new MetalStats("copper", "Copper", 2, 
    		new ArmorStats(new int[]{2, 3, 2, 1}, 50, 5, 0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(5, 2, 180, 5F, 5F), new FluidStats(0xFFE5770A), 1).createMetal();
    public static final Metal DAMASCUS_STEEL = new MetalStats("damascus_steel", "DamascusSteel", 2,
            new ArmorStats(new int[]{3, 5, 6, 3}, 18, 50, 3F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(18, 4, 500, 6F, 6F), new FluidStats(0xFF75663D), -1).createMetal();
    public static final Metal DEEP_IRON = new MetalStats("deep_iron", "DeepIron", 2,
            new ArmorStats(new int[]{2, 4, 5, 2}, 1, 38, 0.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(14, 3, 250, 6F, 6F), new FluidStats(0xFF383C72), 2).createMetal();
    public static final Metal DESICHALKOS = new MetalStats("desichalkos", "Desichalkos", 2,
            new ArmorStats(new int[]{4, 5, 7, 4}, 30, 180, 3F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(30, 4, 1800, 8F, 8F), new FluidStats(0xFF420098), -1).createMetal();
    public static final Metal ELECTRUM = new MetalStats("electrum", "Electrum", 2,
            new ArmorStats(new int[]{3, 5, 6, 2}, 30, 51, 3F, SoundEvents.ENTITY_LIGHTNING_IMPACT),
            new ToolStats(30, 2, 50, 14F, 5F), new FluidStats(0xFFEFEF57), -1).createMetal();
    public static final Metal EXIMITE = new MetalStats("eximite", "Eximite", 2,
            new ArmorStats(new int[]{4, 5, 6, 4}, 25, 100, 5.0F, SoundEvents.ENTITY_ENDERDRAGON_GROWL),
            new ToolStats(25, 7, 1000, 8F, 7F), new FluidStats(0xFF5E4191), 3).createMetal();
    public static final Metal HADEROTH = new MetalStats("haderoth", "Haderoth", 2,
            new ArmorStats(new int[]{4, 5, 7, 4}, 19, 125, 6F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(19, 5, 1250, 12F, 7F), new FluidStats(0xFF963700), -1).createMetal();
    public static final Metal HEPATIZON = new MetalStats("hepatizon", "Hepatizon", 2,
            new ArmorStats(new int[]{3, 3, 4, 2}, 22, 57, 2F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(22, 3, 300, 8F, 5F), new FluidStats(0xFF755E86), -1).createMetal();
    public static final Metal IGNATIUS = new MetalStats("ignatius", "Ignatius", 2,
            new ArmorStats(new int[]{2, 5, 6, 2}, 15, 24, 0.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(15, 2, 200, 4F, 6F), new FluidStats(0xFFFF9100), 1).createMetal();
    public static final Metal INFUSCOLIUM = new MetalStats("infuscolium", "Infuscolium", 2, null, null, new FluidStats(0xFF7F036E), 2).createMetal();
    public static final Metal INOLASHITE = new MetalStats("inolashite", "Inolashite", 2,
            new ArmorStats(new int[]{3, 5, 7, 4}, 25, 70, 4F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(25, 5, 900, 8F, 7F), new FluidStats(0xFF00A579), -1).createMetal();
    public static final Metal KALENDRITE = new MetalStats("kalendrite", "Kalendrite", 2,
            new ArmorStats(new int[]{4, 5, 6, 4}, 20, 40, 3.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(20, 5, 1000, 8F, 7F), new FluidStats(0xFF9941DD), 4).createMetal();
    public static final Metal LEMURITE = new MetalStats("lemurite", "Lemurite", 2, null, null, new FluidStats(0xFFD0D0D0), 2).createMetal();
    public static final Metal MANGANESE = new MetalStats("manganese", "Manganese", 2, null, null, new FluidStats(0xFFFFAEDF), 4).createMetal();
    public static final Metal MEUTOITE = new MetalStats("meutoite", "Meutoite", 2, null, null, new FluidStats(0xFF533468), 4).createMetal();
    public static final Metal MIDASIUM = new MetalStats("midasium", "Midasium", 2,
            new ArmorStats(new int[]{3, 3, 5, 2}, 35, 16, 4.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(35, 4, 100, 10F, 7F), new FluidStats(0xFFE2AD00), 3).createMetal();
    public static final Metal MITHRIL = new MetalStats("mithril", "Mithril", 2,
            new ArmorStats(new int[]{2, 4, 5, 3}, 20, 21, 0.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(18, 5, 1000, 9F, 7F), new FluidStats(0xFF6ACBC8), 4).createMetal();
    public static final Metal ORICHALCUM = new MetalStats("orichalcum", "Orichalcum", 2,
            new ArmorStats(new int[]{2, 6, 7, 2}, 4, 20, 1.4F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(20, 6, 1350, 9F, 7F), new FluidStats(0xFF206000), 5).createMetal();
    public static final Metal OURECLASE = new MetalStats("oureclase", "Oureclase", 2,
            new ArmorStats(new int[]{3, 6, 5, 4}, 2, 28, 1.5F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(18, 4, 750, 8F, 6F), new FluidStats(0xFFE08E02), 3).createMetal();
    public static final Metal PLATINUM = new MetalStats("platinum", "Platinum", 2,
            new ArmorStats(new int[]{3, 5, 6, 3}, 12, 17, 0.5F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(50, 3, 100, 16F, 5F), new FluidStats(0xFF327077), 2).createMetal();
    public static final Metal PROMETHEUM = new MetalStats("prometheum", "Prometheum", 2,
            new ArmorStats(new int[]{1, 2, 3, 2}, 11, 30, 0.1F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(16, 2, 200, 4F, 5F), new FluidStats(0xFF377732), 1).createMetal();
    public static final Metal QUICKSILVER = new MetalStats("quicksilver", "QuickSilver", 2, 
    		new ArmorStats(new int[]{4, 7, 5, 4}, 50, 165, 0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(20, 5, 1100, 14F, 7F), new FluidStats(0xFFA9DDDA), -1).createMetal();
    public static final Metal RUBRACIUM = new MetalStats("rubracium", "Rubracium", 2, null, null, new FluidStats(0xFF860303), 4).createMetal();
    public static final Metal SANGUINITE = new MetalStats("sanguinite", "Sanguinite", 2,
            new ArmorStats(new int[]{4, 6, 7, 5}, 25, 175, 4.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(25, 7, 1750, 11F, 8F), new FluidStats(0xFFEF0000), 6).createMetal();
    public static final Metal SHADOW_IRON = new MetalStats("shadow_iron", "ShadowIron", 2,
            new ArmorStats(new int[]{4, 5, 6, 3}, 3, 32, 4.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(3, 2, 300, 5F, 6F), new FluidStats(0xFF533A29), 1).createMetal();
    public static final Metal SHADOW_STEEL = new MetalStats("shadow_steel", "ShadowSteel", 2,
            new ArmorStats(new int[]{4, 5, 6, 3}, 5, 40, 3.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(5, 3, 400, 6F, 7F), new FluidStats(0xFF8E755D), -1).createMetal();
    public static final Metal SILVER = new MetalStats("silver", "Silver", 2,
            new ArmorStats(new int[]{2, 3, 4, 2}, 20, 8, 2.1F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(20, 1, 25, 12F, 5F), new FluidStats(0xFFA7C3D5), 1).createMetal();
    public static final Metal STEEL = new MetalStats("steel", "Steel", 2,
            new ArmorStats(new int[]{3, 5, 6, 3}, 18, 40, 4F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(18, 4, 750, 8F, 7F), new FluidStats(0xFF757575), -1).createMetal();
    public static final Metal TARTARITE = new MetalStats("tartarite", "Tartarite", 2,
            new ArmorStats(new int[]{5, 6, 7, 5}, 20, 300, 6.0F, SoundEvents.ENTITY_WITHER_SKELETON_AMBIENT),
            new ToolStats(25, 8, 3000, 14F, 9F), new FluidStats(0xFFEF6000), -1).createMetal();
    public static final Metal TIN = new MetalStats("tin", "Tin", 2, null, null, new FluidStats(0xFFD5D5D5), 1).createMetal();
    public static final Metal VULCANITE = new MetalStats("vulcanite", "Vulcanite", 2,
            new ArmorStats(new int[]{4, 6, 7, 4}, 20, 150, 4.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(20, 6, 1500, 10F, 7F), new FluidStats(0xFFFF8103), 5).createMetal();
    public static final Metal VYROXERES = new MetalStats("vyroxeres", "Vyroxeres", 2,
            new ArmorStats(new int[]{4, 5, 6, 3}, 16, 37, 3.0F, SoundEvents.ITEM_ARMOR_EQUIP_IRON),
            new ToolStats(16, 4, 300, 7F, 7F), new FluidStats(0xFF2BFF00), 4).createMetal();
    public static final Metal ZINC = new MetalStats("zinc", "Zinc", 2, null, null, new FluidStats(0xFFFBFFDA), 1).createMetal();

    public static void registerFluids() {
        for (Metal m : metalList) {
            FluidRegistry.registerFluid(m.getMolten());
            m.initFluidBlock();
        }
    }

    public static void registerBlocks(IForgeRegistry<Block> registry) {
        for (Metal m : metalList) {
            registry.register(m.getBlock());
            if (m.getOre() != null) {
                registry.register(m.getOre());
            }
            registry.register(m.getFluidBlock());
        }
    }

    public static void registerModels() {
        for (Metal m : metalList) {
            m.getDust().registerItemModel();
            m.getIngot().registerItemModel();
            if (m.getOre() != null) {
                m.getOre().registerItemModel(Item.getItemFromBlock(m.getOre()));
            }
            m.getBlock().registerItemModel(Item.getItemFromBlock(m.getBlock()));
            m.getFluidBlock().registerItemModel(Item.getItemFromBlock(m.getFluidBlock()));
        }
    }

    public static void registerItems(IForgeRegistry<Item> registry) {
        for (Metal m : metalList) {
            registry.register(m.getBlock().createItemBlock());
            if (m.getOre() != null) {
                registry.register(m.getOre().createItemBlock());
            }
            registry.register(m.getFluidBlock().createItemBlock());
            registry.register(m.getDust());
            registry.register(m.getIngot());
        }
    }
}