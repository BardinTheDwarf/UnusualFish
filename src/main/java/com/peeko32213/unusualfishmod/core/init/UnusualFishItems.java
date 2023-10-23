package com.peeko32213.unusualfishmod.core.init;

import com.peeko32213.unusualfishmod.UnusualFishMod;
import com.peeko32213.unusualfishmod.common.item.tools.AbyssalFuryItem;
import com.peeko32213.unusualfishmod.common.item.tools.DepthScytheItem;
import com.peeko32213.unusualfishmod.common.item.ItemModFishBucket;

import com.peeko32213.unusualfishmod.common.item.ItemModFoods;
import com.peeko32213.unusualfishmod.common.item.tools.whips.UnusualFishWhipItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.level.material.Fluids;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public final class UnusualFishItems {
	private UnusualFishItems() {
	}

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
			UnusualFishMod.MOD_ID);

	// Raw Foods
	public static final RegistryObject<Item> RAW_RIPPER = ITEMS.register("raw_ripper", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_RIPPER).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_AERO_MONO = ITEMS.register("raw_aero_mono", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_AERO_MONO).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_AERO_MONO_STICK = ITEMS.register("raw_aero_mono_stick", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_AERO_MONO_STICK).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_BUMPFACE = ITEMS.register("raw_bumpface", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_BUMPFACE).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_RHINO_TETRA = ITEMS.register("raw_rhino_tetra", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_TETRA_RHINO).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_SAILOR_BARB = ITEMS.register("raw_sailor_barb", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_SAILOR_BARB).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_BARK_ANGELFISH = ITEMS.register("raw_bark_angelfish", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_BARK_ANGELFISH).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_SPINDLEFISH = ITEMS.register("raw_spindlefish", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_SPINDLEFISH).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_BLIZZARD_TUNA = ITEMS.register("raw_blizzard_tuna", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_BLIZZARD_TUNA).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_VEIL_TENTACLE = ITEMS.register("raw_veil_tentacle", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_VEIL_TENTACLE).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_MOSSTHORN = ITEMS.register("raw_mossthorn", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_MOSSTHORN).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_SHOCKCAT = ITEMS.register("raw_shockcat", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_SHOCKCAT).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_LOBSTER = ITEMS.register("raw_lobster", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_LOBSTER).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_SNOWFLAKE = ITEMS.register("raw_snowflake", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_SNOWFLAKE).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_EYEKITO = ITEMS.register("raw_eyekito", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_EYEKITO).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> RAW_EYELASH = ITEMS.register("raw_eyelash", () -> new Item(new Item.Properties().food(ItemModFoods.RAW_EYELASH).tab(UnusualFishMod.UNUSUAL_TAB)));

	// Cooked Foods
	public static final RegistryObject<Item> COOKED_AERO_MONO_STICK = ITEMS.register("cooked_aero_mono_stick", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_AERO_MONO_STICK).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> COOKED_BUMPFACE = ITEMS.register("cooked_bumpface", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_BUMPFACE).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> COOKED_RHINO_TETRA = ITEMS.register("cooked_rhino_tetra", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_TETRA_RHINO).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> COOKED_SAILOR_BARB = ITEMS.register("cooked_sailor_barb", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_SAILOR_BARB).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> COOKED_BLIZZARD_TUNA = ITEMS.register("cooked_blizzard_tuna", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_BLIZZARD_TUNA).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> COOKED_VEIL_TENTACLE = ITEMS.register("cooked_veil_tentacle", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_VEIL_TENTACLE).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> COOKED_MOSSTHORN = ITEMS.register("cooked_mossthorn", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_MOSSTHORN).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> COOKED_BARK_ANGELFISH = ITEMS.register("cooked_bark_angelfish", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_BARK_ANGELFISH).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> COOKED_LOBSTER = ITEMS.register("cooked_lobster", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_LOBSTER).tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> COOKED_SHOCKCAT = ITEMS.register("cooked_shockcat", () -> new Item(new Item.Properties().food(ItemModFoods.COOKED_SHOCKCAT).tab(UnusualFishMod.UNUSUAL_TAB)));

	// Drops
	public static final RegistryObject<Item> GNASHER_ORGAN = ITEMS.register("gnasher_organ", () -> new Item(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> GLO_GEL = ITEMS.register("glo_gel", () -> new Item(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> SHOCKCAT_TENDRIL = ITEMS.register("tendril", () -> new Item(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<Item> DEEP_CHITIN = ITEMS.register("deep_chitin", () -> new Item(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	// Gear
	public static final RegistryObject<UnusualFishWhipItem> TENDRIL_WHIP = ITEMS.register("tendril_whip", () -> new UnusualFishWhipItem(Tiers.IRON, 1.0F, -3.4F, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).durability(450)));
	public static final RegistryObject<Item> DEPTH_SCYTHE = ITEMS.register("depth_scythe", () -> new DepthScytheItem(Tiers.DIAMOND, 2, -3.4F, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).durability(600)));
	public static final RegistryObject<Item> ABYSSAL_FURY = ITEMS.register("abyssal_fury", () -> new AbyssalFuryItem(new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).durability(500)));

	// Spawn Eggs
	public static final RegistryObject<ForgeSpawnEggItem> AERO_MONO_SPAWN_EGG = ITEMS.register("aero_mono_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.AERO_MONO, 0x8ea6af, 0x5b78ac, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> PINKFIN_SPAWN_EGG = ITEMS.register("pinkfin_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.PINKFIN, 0x0e011e, 0x421054, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> BARBED_SPAWN_EGG = ITEMS.register("roughback_guitarfish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.ROUGHBACK, 0x7d5e32, 0x612d1a, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> CLOWNTHORN_SPAWN_EGG = ITEMS.register("clownthorn_shark_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.CLOWNTHORN_SHARK, 0xd46c1d, 0xa21e00, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> DUALITY_SPAWN_EGG = ITEMS.register("duality_damselfish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.DUALITY_DAMSELFISH, 0xd7e7f0, 0x090719, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> DROOPING_GOURAMI_SPAWN_EGG = ITEMS.register("drooping_gourami_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.DROOPING_GOURAMI , 0x54291f, 0x52121f, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> MOSSTHORN_SPAWN_EGG = ITEMS.register("mossthorn_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.MOSSTHORN, 0x26a529, 0x034223, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> RHINO_TETRA_SPAWN_EGG = ITEMS.register("rhino_tetra_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.RHINO_TETRA, 0x50b9ad, 0x216687, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> RIPPER_SPAWN_EGG = ITEMS.register("ripper_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.RIPPER, 0x98aa58, 0x746825, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SAILOR_BARB_PAWN_EGG = ITEMS.register("sailor_barb_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SAILOR_BARB, 0x77a439, 0x4b580c, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SEA_PANCAKE_SPAWN_EGG = ITEMS.register("sea_pancake_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SEA_PANCAKE, 0x9e6229, 0x551908, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SEA_SPIDER_SPAWN_EGG = ITEMS.register("sea_spider_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SEA_SPIDER, 0xc58a21, 0x7f0d00, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SPINDLEFISH_SPAWN_EGG = ITEMS.register("spindlefish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SPINDLEFISH, 0xe07d76, 0x78064a, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> TRIPLE_TWIRL_PLECO_SPAWN_EGG = ITEMS.register("triple_twirl_pleco_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.TRIPLE_TWIRL_PLECO, 0xc1923a, 0x903113, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> BRICK_SNAIL_SPAWN_EGG = ITEMS.register("brick_snail_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.BRICK_SNAIL, 0x4b0c16, 0x7c5955, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> ZEBRA_CORNETFISH_SPAWN_EGG = ITEMS.register("zebra_cornetfish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.ZEBRA_CORNETFISH , 0xa088b4, 0x472e63, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> TIGER_PUFFER_SPAWN_EGG = ITEMS.register("tiger_puffer_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.TIGER_PUFFER, 0x4b0f0b, 0xc26715, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> BLACKCAP_SNAIL_SPAWN_EGG = ITEMS.register("blackcap_snail_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.BLACKCAP_SNAIL, 0x211c1e, 0x603d36, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SNEEPSNORP_EGG = ITEMS.register("sneepsnorp_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SNEEPSNORP, 0x404a7b, 0x779aa8, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> DEEP_CRAWLER_SPAWN_EGG = ITEMS.register("deep_crawler_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.DEEP_CRAWLER, 0x1a1825, 0x434751, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> WIZARD_JELLY_SPAWN_EGG = ITEMS.register("wizard_jelly_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.WIZARD_JELLY, 0x1e134c, 0x8b55a6, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> PORCUPINE_LOBSTA_SPAWN_EGG = ITEMS.register("porcupine_lobsta_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.PORCUPINE_LOBSTA, 0x460121, 0x8d2c3f, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> TRUMPET_SQUID_SPAWN_EGG = ITEMS.register("trumpet_squid_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.TRUMPET_SQUID, 0x6a061a, 0xe9b142, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> FRESHWATER_MANTIS_EGG = ITEMS.register("freshwater_mantis_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.FRESHWATER_MANTIS, 0x4b2f1a, 0x7c8b44, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> BARK_ANGELFISH_SPAWN_EGG = ITEMS.register("bark_angelfish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.BARK_ANGELFISH, 0x3b0e08, 0x6b3f21, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SHOCKCAT_SPAWN_EGG = ITEMS.register("shockcat_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SHOCKCAT, 0x222c58, 0x4595ba, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> MUDDYTOP_SNAIL_SPAWN_EGG = ITEMS.register("muddytop_snail_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.MUDDYTOP_SNAIL, 0x23100e, 0x5f4d3b, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> KALAPPA_SPAWN_EGG = ITEMS.register("kalappa_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.KALAPPA, 0x624051, 0x886d86, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> LOBED_SKIPPER_SPAWN_EGG = ITEMS.register("lobed_skipper_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.LOBED_SKIPPER, 0x4b2618, 0x9e632f, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> STOUT_BICHIR_SPAWN_EGG = ITEMS.register("stout_bichir_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.STOUT_BICHIR, 0x07331c, 0x3c7834, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> BEAKED_HERRING_SPAWN_EGG = ITEMS.register("beaked_herring_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.BEAKED_HERRING, 0x516881, 0x71a29f, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> PICKLEFISH_SPAWN_EGG = ITEMS.register("picklefish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.PICKLEFISH, 0x235806, 0xd0cd07, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> BLIND_SAILFIN_SPAWN_EGG = ITEMS.register("blind_sailfin_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.BLIND_SAILFIN, 0xb1717c, 0xd1bdbc, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> DEMON_HERRING_SPAWN_EGG = ITEMS.register("demon_herring_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.DEMON_HERRING, 0x1a1a3b, 0xe952b0, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> AMBER_GOBY_SPAWN_EGG = ITEMS.register("amber_goby_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.AMBER_GOBY, 0xa22902, 0xddb534, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> HATCHET_FISH_SPAWN_EGG = ITEMS.register("hatchet_fish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.HATCHET_FISH, 0x0b0b26, 0x7d3283, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> COPPERFLAME_SPAWN_EGG = ITEMS.register("copperflame_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.COPPERFLAME, 0x44950f, 0xcfde3c, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> ROOTBALL_SPAWN_EGG = ITEMS.register("root_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.ROOTBALL, 0x4c6e11, 0xd8d524, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> CELESTIAL_FISH_SPAWN_EGG = ITEMS.register("celestial_fish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.CELESTIAL_FISH, 0x060e26, 0xece651, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> GNASHER_SPAWN_EGG = ITEMS.register("gnasher_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.GNASHER, 0x050510, 0x6e60c9, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> PRAWN_SPAWN_EGG = ITEMS.register("prawn_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.PRAWN, 0x0a081f, 0x253048, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SQUODDLE_SPAWN_EGG = ITEMS.register("squoddle_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SQUODDLE, 0xbf3f00, 0xd8d2d8, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SEA_MOSQUITO_SPAWN_EGG = ITEMS.register("sea_mosquito_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SEA_MOSQUITO, 0x5a7636, 0x82b472, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> FORKFISH_SPAWN_EGG = ITEMS.register("forkfish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.FORKFISH, 0xa35826, 0xccb05b, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SPOON_SHARK_SPAWN_EGG = ITEMS.register("spoon_shark_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SPOON_SHARK, 0x58241d, 0xb59259, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> CORAL_SKRIMP_EGG = ITEMS.register("coral_skrimp_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.CORAL_SKRIMP, 0x5a0e7a, 0xb34aa2, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> CIRCUS_FISH_SPAWN_EGG = ITEMS.register("circus_fish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.CIRCUSFISH, 0x590d0d, 0xd0c09a, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> BLIZZARDFIN_SPAWN_EGG = ITEMS.register("blizzardfin_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.BLIZZARDFIN, 0x033d9a, 0x25bcce, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> EYELASH_FISH_SPAWN_EGG = ITEMS.register("eyelash_fish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.EYELASH, 0xb7b7ba, 0xfcfcfa, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> SNOWFLAKE_TAIL_FISH_SPAWN_EGG = ITEMS.register("snowflake_tail_fish_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.SNOWFLAKE, 0x496497, 0x93edfb, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> TIGER_JUNGLE_SHARK_SPAWN_EGG = ITEMS.register("tiger_jungle_shark_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.TIGER_JUNGLE_SHARK, 0x404d30, 0x2fe4d4, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> CRIMSONSHELL_SQUID_SPAWN_EGG = ITEMS.register("crimsonshell_squid_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.CRIMSONSHELL_SQUID, 0x0e011e, 0xda4938, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> VOLT_ANGLER_SPAWN_EGG = ITEMS.register("volt_angler_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.VOLT_ANGLER, 0x0e011e, 0xffea14, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));
	public static final RegistryObject<ForgeSpawnEggItem> TRIBBLE_SPAWN_EGG = ITEMS.register("tribble_spawn_egg", () -> new ForgeSpawnEggItem(UnusualFishEntities.TRIBBLE, 0x0e011e, 0x5e1c68, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB)));

	// Buckets
	public static final RegistryObject<Item> AERO_MONO_BUCKET = ITEMS.register("aero_mono_bucket", () -> new ItemModFishBucket(UnusualFishEntities.AERO_MONO, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> RHINO_TETRA_BUCKET = ITEMS.register("rhino_tetra_bucket", () -> new ItemModFishBucket(UnusualFishEntities.RHINO_TETRA, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> DUALITY_DAMSELFISH_BUCKET = ITEMS.register("duality_damselfish_bucket", () -> new ItemModFishBucket(UnusualFishEntities.DUALITY_DAMSELFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> DROOPING_GOURAMI_BUCKET = ITEMS.register("drooping_gourami_bucket", () -> new ItemModFishBucket(UnusualFishEntities.DROOPING_GOURAMI, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> MOSSTHORN_BUCKET = ITEMS.register("mossthorn_bucket", () -> new ItemModFishBucket(UnusualFishEntities.MOSSTHORN, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> SAILOR_BARB_BUCKET = ITEMS.register("sailor_barb_bucket", () -> new ItemModFishBucket(UnusualFishEntities.SAILOR_BARB, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> TRIPLE_TWIRL_PLECO_BUCKET = ITEMS.register("triple_twirl_pleco_bucket", () -> new ItemModFishBucket(UnusualFishEntities.TRIPLE_TWIRL_PLECO, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> SPINDLEFISH_BUCKET = ITEMS.register("spindlefish_bucket", () -> new ItemModFishBucket(UnusualFishEntities.SPINDLEFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> RIPPER_BUCKET = ITEMS.register("ripper_bucket", () -> new ItemModFishBucket(UnusualFishEntities.RIPPER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> SEA_SPIDER_BUCKET = ITEMS.register("sea_spider_bucket", () -> new ItemModFishBucket(UnusualFishEntities.SEA_SPIDER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> CLOWNTHORN_SHARK_BUCKET = ITEMS.register("clownthorn_shark_bucket", () -> new ItemModFishBucket(UnusualFishEntities.CLOWNTHORN_SHARK, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> SNEEPSNORP_BUCKET = ITEMS.register("sneepsnorp_bucket", () -> new ItemModFishBucket(UnusualFishEntities.SNEEPSNORP, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> BLACKCAP_SNAIL_BUCKET = ITEMS.register("blackcap_snail_bucket", () -> new ItemModFishBucket(UnusualFishEntities.BLACKCAP_SNAIL, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> BRICK_SNAIL_BUCKET = ITEMS.register("brick_snail_bucket", () -> new ItemModFishBucket(UnusualFishEntities.BRICK_SNAIL, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> DEEP_CRAWLER_BUCKET = ITEMS.register("deep_crawler_bucket", () -> new ItemModFishBucket(UnusualFishEntities.DEEP_CRAWLER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> WIZARD_JELLY_BUCKET = ITEMS.register("wizard_jelly_bucket", () -> new ItemModFishBucket(UnusualFishEntities.WIZARD_JELLY, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> PORCUPINE_LOBSTA_BUCKET = ITEMS.register("porcupine_lobsta_bucket", () -> new ItemModFishBucket(UnusualFishEntities.PORCUPINE_LOBSTA, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> FRESHWATER_MANTIS_BUCKET = ITEMS.register("freshwater_mantis_bucket", () -> new ItemModFishBucket(UnusualFishEntities.FRESHWATER_MANTIS, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> BARK_ANGELFISH_BUCKET = ITEMS.register("bark_angelfish_bucket", () -> new ItemModFishBucket(UnusualFishEntities.BARK_ANGELFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> SKIPPER_BUCKET = ITEMS.register("lobed_skipper_bucket", () -> new ItemModFishBucket(UnusualFishEntities.LOBED_SKIPPER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> BEAKED_HERRING_BUCKET = ITEMS.register("beaked_herring_bucket", () -> new ItemModFishBucket(UnusualFishEntities.BEAKED_HERRING, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> PICKLEFISH_BUCKET = ITEMS.register("picklefish_bucket", () -> new ItemModFishBucket(UnusualFishEntities.PICKLEFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> BLIND_SAILFIN_BUCKET = ITEMS.register("blind_sailfin_bucket", () -> new ItemModFishBucket(UnusualFishEntities.BLIND_SAILFIN, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> DEMON_HERRING_BUCKET = ITEMS.register("demon_herring_bucket", () -> new ItemModFishBucket(UnusualFishEntities.DEMON_HERRING, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> AMBER_GOBY_BUCKET = ITEMS.register("amber_goby_bucket", () -> new ItemModFishBucket(UnusualFishEntities.AMBER_GOBY, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> HATCHET_FISH_BUCKET = ITEMS.register("hatchet_fish_bucket", () -> new ItemModFishBucket(UnusualFishEntities.HATCHET_FISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> COPPERFLAME_BUCKET = ITEMS.register("copperflame_bucket", () -> new ItemModFishBucket(UnusualFishEntities.COPPERFLAME, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> ROOTBALL_BUCKET = ITEMS.register("rootball_bucket", () -> new ItemModFishBucket(UnusualFishEntities.ROOTBALL, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> SQUODDLE_BUCKET = ITEMS.register("squoddle_bucket", () -> new ItemModFishBucket(UnusualFishEntities.SQUODDLE, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> SEA_MOSQUITO_BUCKET = ITEMS.register("sea_mosquito_bucket", () -> new ItemModFishBucket(UnusualFishEntities.SEA_MOSQUITO, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> FORKFISH_BUCKET = ITEMS.register("forkfish_bucket", () -> new ItemModFishBucket(UnusualFishEntities.FORKFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> SPOON_SHARK_BUCKET = ITEMS.register("spoon_shark_bucket", () -> new ItemModFishBucket(UnusualFishEntities.SPOON_SHARK, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> CORAL_SKRIMP_BUCKET = ITEMS.register("coral_skrimp_bucket", () -> new ItemModFishBucket(UnusualFishEntities.CORAL_SKRIMP, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> CIRCUS_FISH_BUCKET = ITEMS.register("circus_fish_bucket", () -> new ItemModFishBucket(UnusualFishEntities.CIRCUSFISH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> EYELASH_FISH_BUCKET = ITEMS.register("eyelash_fish_bucket", () -> new ItemModFishBucket(UnusualFishEntities.EYELASH, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> SNOWFLAKE_TAIL_FISH_BUCKET = ITEMS.register("snowflake_tail_fish_bucket", () -> new ItemModFishBucket(UnusualFishEntities.SNOWFLAKE, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> CRIMSONSHELL_SQUID_BUCKET = ITEMS.register("crimsonshell_squid_bucket", () -> new ItemModFishBucket(UnusualFishEntities.CRIMSONSHELL_SQUID, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
	public static final RegistryObject<Item> VOLT_ANGLER_BUCKET = ITEMS.register("volt_angler_bucket", () -> new ItemModFishBucket(UnusualFishEntities.VOLT_ANGLER, () -> Fluids.WATER, Items.BUCKET, false, new Item.Properties().tab(UnusualFishMod.UNUSUAL_TAB).stacksTo(1)));
}
