package home;

public class Behaviors {
		//instantiation of all the behaviors possible
	Behavior behaviors[] = new Behavior[66];
	//behaviors = new Behavior[100];
	
	//Movement/Positioning
	//behaviors[0] =  moveAroundObstacles;
	
	Behavior selectTemporaryFightingPosition = new Behavior();
	Behavior constructIndividualFightingPosition = new Behavior();
	Behavior prepareForUnitMove = new Behavior();
	Behavior superviseConstrucftionOfFightingPosition = new Behavior();
	Behavior conductOccupationOfAnAssemblyArea = new Behavior();
	Behavior conductAMovementToContactByAPlatoon = new Behavior();
	Behavior navigatePrepareAnOperationOverlay = new Behavior();
	Behavior conductATacticalRoadMarch = new Behavior();
	Behavior conductAnAreaReconnaissancebyPlatoon = new Behavior();
	Behavior conductARouteReconnaissanceMission = new Behavior();
	Behavior leadAConvoySerialMarchUnit = new Behavior();
	Behavior planUnitMove = new Behavior();
	Behavior fromthePlatoonIntoRiotFormation = new Behavior();
	
	
	//React to Enemy Offensive
	Behavior moveUnderDirectFire = new Behavior();
	Behavior moveOverObstacles = new Behavior();
	Behavior reactToIndirecftFireWhileDismounted = new Behavior();
	Behavior reactToFlares = new Behavior();
	Behavior reactToEnemyFireWhileMounted = new Behavior();
	Behavior reactToUnexplodedHazards = new Behavior();
	Behavior reactToDirectFire = new Behavior();
	Behavior adjustIndirectFire = new Behavior();
	Behavior processCapturedActor = new Behavior();
	Behavior conductADefenseByAPlatoon = new Behavior();
	
	
	//Communication Functions

	Behavior useVisualSignalingTechniques = new Behavior();
	Behavior reportCasualties = new Behavior();
	

	//Take on a Role

	Behavior performDutyAsAGuard = new Behavior();


	//Use Item
	Behavior useOfNightVisionGoggles = new Behavior();

	//Issue an Order
	Behavior issueAFragmentOrder = new Behavior();
	Behavior issueAWarningOrder = new Behavior();
	Behavior conductADefenseBySquad = new Behavior();
	Behavior consolidateAUnit = new Behavior();
	Behavior reOrganizeAUnit = new Behavior();
	Behavior superviseTheImplementationOfAIrDefense = new Behavior();
	Behavior superviseHandlingOfEnemiese = new Behavior();

	//Engineer
	Behavior establishAnObservationPost = new Behavior();
	Behavior supviseMinefieldBreachingOps = new Behavior();
	Behavior directConstructionOfNonExplosiveSObstacles = new Behavior();
	Behavior prepareASituationMap = new Behavior();
	

	//First Aid
	Behavior implementPreventiveMedicineMeasures = new Behavior();
	Behavior requestMEdicalEvacuation = new Behavior();

	//Intelligence
	Behavior identifyIntelligenceANdElectronicWarfareAssets = new Behavior();
	Behavior planTacticalReSupplyOps = new Behavior();
	Behavior planConvoySecurityOps = new Behavior();
	Behavior protecftClassifiedInformation = new Behavior();
	Behavior storeClassifiedInformation = new Behavior();
	
	Behavior bombardPlayerWithLowestStrength = new Behavior();
	Behavior bombardPlayerWithHighestStrengthl = new Behavior();
	
	Behavior actoresAreAbleTSoCamaflougeThemselves = new Behavior();
	Behavior enemyWhenWoundedStalkToGainHPBack = new Behavior();
	Behavior enemySniper = new Behavior();
	Behavior gangUpOnPlauyerContinouslyAttackingEnemy = new Behavior();
	Behavior senseTrailsAreLeft = new Behavior();
	Behavior attackingOneEnemyTheyCallForBackup = new Behavior();
	Behavior enemiesTakeDifferentFormationse = new Behavior();
	Behavior enemiesAttackTheWeak = new Behavior();
	Behavior enemiesExamineEquipmentAndGoForReinforcements = new Behavior();
	Behavior enemyTravelInPacks = new Behavior();
	Behavior enemySetUpTroops = new Behavior();
	Behavior enemySetUpAmbushes = new Behavior();
	Behavior enemyTravelInStealth = new Behavior();
	Behavior enemyTakeHostages = new Behavior();
	Behavior useAHumanShield = new Behavior();
	Behavior enemiesMayDuck = new Behavior();
	Behavior enemiesFakeDeath = new Behavior();

	
	
	public void populateBehaviorList()
	{
		behaviors[0] = selectTemporaryFightingPosition; 
		behaviors[1] = constructIndividualFightingPosition;
		behaviors[2] =  prepareForUnitMove;
		behaviors[3] = superviseConstrucftionOfFightingPosition;
		behaviors[4] =  conductOccupationOfAnAssemblyArea;
		behaviors[5] = conductAMovementToContactByAPlatoon; 
		behaviors[6] =  navigatePrepareAnOperationOverlay;
		behaviors[7] =  conductATacticalRoadMarch;
		behaviors[8] =  conductAnAreaReconnaissancebyPlatoon; 
		behaviors[9] = conductARouteReconnaissanceMission;
		behaviors[10] = leadAConvoySerialMarchUnit;
		behaviors[11] = planUnitMove;
		behaviors[12] = fromthePlatoonIntoRiotFormation;
		
		
		//React to Enemy Offensive
		behaviors[13] = moveUnderDirectFire; 
		behaviors[14] = moveOverObstacles; 
		behaviors[15] = reactToIndirecftFireWhileDismounted; 
		behaviors[16] = reactToFlares;
		behaviors[17] = reactToEnemyFireWhileMounted;
		behaviors[18] = reactToUnexplodedHazards;
		behaviors[19] = reactToDirectFire; 
		behaviors[20] = adjustIndirectFire; 
		behaviors[21] = processCapturedActor; 
		behaviors[22] = conductADefenseByAPlatoon;
		
		
		//Communication Functions

		behaviors[23] = useVisualSignalingTechniques;
		behaviors[24] = reportCasualties;
		

		//Take on a Role

		behaviors[25] = performDutyAsAGuard;


		//Use Item
		behaviors[26] = useOfNightVisionGoggles;

		//Issue an Order
		behaviors[27] = issueAFragmentOrder;
		behaviors[28] = issueAWarningOrder;
		behaviors[29] = conductADefenseBySquad; 
		behaviors[30] = consolidateAUnit;
		behaviors[31] = reOrganizeAUnit;
		behaviors[32] = superviseTheImplementationOfAIrDefense;
		behaviors[33] = superviseHandlingOfEnemiese; 

		//Engineer
		behaviors[34]  = establishAnObservationPost; 
		behaviors[35] = supviseMinefieldBreachingOps; 
		behaviors[36] = directConstructionOfNonExplosiveSObstacles; 
		behaviors[37] = prepareASituationMap;
		

		//First Aid
		behaviors[38] = implementPreventiveMedicineMeasures; 
		behaviors[39] = requestMEdicalEvacuation; 

		//Intelligence
		behaviors[40] = identifyIntelligenceANdElectronicWarfareAssets; 
		behaviors[41] =  planTacticalReSupplyOps;
		behaviors[42] = planConvoySecurityOps; 
		behaviors[43] = protecftClassifiedInformation; 
		behaviors[44] = storeClassifiedInformation;
		
		behaviors[45] = bombardPlayerWithLowestStrength;
		behaviors[50] = bombardPlayerWithHighestStrengthl;
		
		behaviors[51] = actoresAreAbleTSoCamaflougeThemselves; 
		behaviors[52] = enemyWhenWoundedStalkToGainHPBack; 
		behaviors[53] = enemySniper;
		behaviors [54] = gangUpOnPlauyerContinouslyAttackingEnemy; 
		behaviors [55] = senseTrailsAreLeft;
		 behaviors [56] = attackingOneEnemyTheyCallForBackup;
		 behaviors[57] = enemiesAttackTheWeak; 
		 behaviors[58] = enemiesExamineEquipmentAndGoForReinforcements;
		 behaviors[59] = enemyTravelInPacks;
		 behaviors[60] = enemySetUpTroops;
		 behaviors[61] = enemySetUpAmbushes;
		 behaviors[62] = enemyTravelInStealth; 
		 behaviors[63] = enemyTakeHostages; 
		 behaviors[64] = useAHumanShield;
		 behaviors[65] = enemiesMayDuck;
		 behaviors[66] = enemiesFakeDeath;

	}
	
	
	//output
	String [] output = new String[66];
	
	public void populateOutput()
	{

		output[0] = "selectTemporaryFightingPosition"; 
		output[1] = "constructIndividualFightingPosition";
		output[2] =  "prepareForUnitMove";
		output[3] = "superviseConstrucftionOfFightingPosition";
		output[4] =  "conductOccupationOfAnAssemblyArea";
		output[5] = "conductAMovementToContactByAPlatoon"; 
		output[6] =  "navigatePrepareAnOperationOverlay";
		output[7] =  "conductATacticalRoadMarch";
		output[8] =  "conductAnAreaReconnaissancebyPlatoon"; 
		output[9] = "conductARouteReconnaissanceMission";
		output[10] = "leadAConvoySerialMarchUnit";
		output[11] = "planUnitMove";
		output[12] = "fromthePlatoonIntoRiotFormation";


		//React to Enemy Offensive
		output[13] = "moveUnderDirectFire"; 
		output[14] = "moveOverObstacles"; 
		output[15] = "reactToIndirecftFireWhileDismounted"; 
		output[16] = "reactToFlares";
		output[17] = "reactToEnemyFireWhileMounted";
		output[18] = "reactToUnexplodedHazards";
		output[19] = "reactToDirectFire"; 
		output[20] = "adjustIndirectFire"; 
		output[21] = "processCapturedActor"; 
		output[22] = "conductADefenseByAPlatoon";


		//Communication Functions

		output[23] = "useVisualSignalingTechniques";
		output[24] = "reportCasualties";


		//Take on a Role

		output[25] = "performDutyAsAGuard";


		//Use Item
		output[26] = "useOfNightVisionGoggles";

		//Issue an Order
		output[27] = "issueAFragmentOrder";
		output[28] = "issueAWarningOrder";
		output[29] = "conductADefenseBySquad"; 
		output[30] = "consolidateAUnit";
		output[31] = "reOrganizeAUnit";
		output[32] = "superviseTheImplementationOfAIrDefense";
		output[33] = "superviseHandlingOfEnemiese"; 

		//Engineer
		output[34]  = "establishAnObservationPost"; 
		output[35] = "supviseMinefieldBreachingOps"; 
		output[36] = "directConstructionOfNonExplosiveSObstacles"; 
		output[37] = "prepareASituationMap";


		//First Aid
		output[38] = "implementPreventiveMedicineMeasures"; 
		output[39] = "requestMEdicalEvacuation"; 

		//Intelligence
		output[40] = "identifyIntelligenceANdElectronicWarfareAssets"; 
		output[41] =  "planTacticalReSupplyOps";
		output[42] = "planConvoySecurityOps"; 
		output[43] = "protecftClassifiedInformation"; 
		output[44] = "storeClassifiedInformation";

		output[45] = "bombardPlayerWithLowestStrength";
		output[50] = "bombardPlayerWithHighestStrength";

		output[51] = "actoresAreAbleTSoCamaflougeThemselves"; 
		output[52] = "enemyWhenWoundedStalkToGainHPBack"; 
		output[53] = "enemySniper";
		output [54] = "gangUpOnPlauyerContinouslyAttackingEnemy"; 
		output [55] = "senseTrailsAreLeft";
		output [56] = "attackingOneEnemyTheyCallForBackup";
		output[57] = "enemiesAttackTheWeak"; 
		output[58] = "enemiesExamineEquipmentAndGoForReinforcements";
		output[59] = "enemyTravelInPacks";
		output[60] = "enemySetUpTroops";
		output[61] = "enemySetUpAmbushes";
		output[62] = "enemyTravelInStealth"; 
		output[63] = "enemyTakeHostages"; 
		output[64] = "useAHumanShield";
		output[65] = "enemiesMayDuck";
		output[66] = "enemiesFakeDeath";
	}

}	