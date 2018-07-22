package structure.buildcode;

public class StoneHenge {

	private String prefix = "/summon minecraft:armor_stand ";
	private String stoneSuffix = "\",ShowArms:1,Invisible:1,NoBasePlate:1,NoGravity:1,HandItems:[{id:stone,Count:1},{}],Pose:{Body:[0f,0f,0f],LeftArm:[0f,0f,0f],RightArm:[346f,44f,270f],LeftLeg:[0f,0f,0f],RightLeg:[0f,0f,0f],Head:[0f,0f,0f]}}";
	
	public String createStoneHenge(int lineNumber, String structureCode)
	{
		if(lineNumber > 322)
			return "null";
		StringBuilder sb = new StringBuilder();
		sb.append(prefix);
		switch(lineNumber)
		{
		  case 0: sb.append("~-0.18 ~0.652 ~2.1000000000000005 {CustomName:\""); break;
		  case 1: sb.append("~-0.18 ~0.652 ~2.4400000000000004 {CustomName:\""); break;
		  case 2: sb.append("~-0.18 ~0.652 ~3.8 {CustomName:\""); break;
		  case 3: sb.append("~-0.18 ~0.652 ~4.14 {CustomName:\""); break;
		  case 4: sb.append("~-0.18 ~0.992 ~2.1000000000000005 {CustomName:\""); break;
		  case 5: sb.append("~-0.18 ~0.992 ~2.4400000000000004 {CustomName:\""); break;
		  case 6: sb.append("~-0.18 ~0.992 ~3.8 {CustomName:\""); break;
		  case 7: sb.append("~-0.18 ~0.992 ~4.14 {CustomName:\""); break;
		  case 8: sb.append("~-0.18 ~1.332 ~2.1000000000000005 {CustomName:\""); break;
		  case 9: sb.append("~-0.18 ~1.332 ~2.4400000000000004 {CustomName:\""); break;
		  case 10: sb.append("~-0.18 ~1.332 ~3.8 {CustomName:\""); break;
		  case 11: sb.append("~-0.18 ~1.332 ~4.14 {CustomName:\""); break;
		  case 12: sb.append("~-0.18 ~1.6720000000000002 ~2.1000000000000005 {CustomName:\""); break;
		  case 13: sb.append("~-0.18 ~1.6720000000000002 ~2.4400000000000004 {CustomName:\""); break;
		  case 14: sb.append("~-0.18 ~1.6720000000000002 ~3.8 {CustomName:\""); break;
		  case 15: sb.append("~-0.18 ~1.6720000000000002 ~4.14 {CustomName:\""); break;
		  case 16: sb.append("~-0.18 ~2.012 ~2.1000000000000005 {CustomName:\""); break;
		  case 17: sb.append("~-0.18 ~2.012 ~2.4400000000000004 {CustomName:\""); break;
		  case 18: sb.append("~-0.18 ~2.012 ~3.8 {CustomName:\""); break;
		  case 19: sb.append("~-0.18 ~2.012 ~4.14 {CustomName:\""); break;
		  case 20: sb.append("~-0.18 ~2.3520000000000003 ~2.1000000000000005 {CustomName:\""); break;
		  case 21: sb.append("~-0.18 ~2.3520000000000003 ~2.4400000000000004 {CustomName:\""); break;
		  case 22: sb.append("~-0.18 ~2.3520000000000003 ~3.8 {CustomName:\""); break;
		  case 23: sb.append("~-0.18 ~2.3520000000000003 ~4.14 {CustomName:\""); break;
		  case 24: sb.append("~-0.18 ~2.692 ~2.1000000000000005 {CustomName:\""); break;
		  case 25: sb.append("~-0.18 ~2.692 ~2.4400000000000004 {CustomName:\""); break;
		  case 26: sb.append("~-0.18 ~2.692 ~3.8 {CustomName:\""); break;
		  case 27: sb.append("~-0.18 ~2.692 ~4.14 {CustomName:\""); break;
		  case 28: sb.append("~-0.18 ~3.0320000000000005 ~2.1000000000000005 {CustomName:\""); break;
		  case 29: sb.append("~-0.18 ~3.0320000000000005 ~2.4400000000000004 {CustomName:\""); break;
		  case 30: sb.append("~-0.18 ~3.0320000000000005 ~3.8 {CustomName:\""); break;
		  case 31: sb.append("~-0.18 ~3.0320000000000005 ~4.14 {CustomName:\""); break;
		  case 32: sb.append("~0.16000000000000003 ~0.652 ~3.12 {CustomName:\""); break;
		  case 33: sb.append("~0.5 ~0.652 ~1.08 {CustomName:\""); break;
		  case 34: sb.append("~0.5 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 35: sb.append("~0.5 ~0.652 ~3.12 {CustomName:\""); break;
		  case 36: sb.append("~0.5 ~0.652 ~3.46 {CustomName:\""); break;
		  case 37: sb.append("~0.5 ~0.992 ~1.08 {CustomName:\""); break;
		  case 38: sb.append("~0.5 ~1.332 ~1.08 {CustomName:\""); break;
		  case 39: sb.append("~0.5 ~1.6720000000000002 ~1.08 {CustomName:\""); break;
		  case 40: sb.append("~0.5 ~2.012 ~1.08 {CustomName:\""); break;
		  case 41: sb.append("~0.5 ~2.3520000000000003 ~1.08 {CustomName:\""); break;
		  case 42: sb.append("~0.5 ~2.692 ~1.08 {CustomName:\""); break;
		  case 43: sb.append("~0.5 ~3.0320000000000005 ~1.08 {CustomName:\""); break;
		  case 44: sb.append("~0.8400000000000001 ~0.652 ~0.74 {CustomName:\""); break;
		  case 45: sb.append("~0.8400000000000001 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 46: sb.append("~0.8400000000000001 ~0.652 ~3.46 {CustomName:\""); break;
		  case 47: sb.append("~0.8400000000000001 ~0.652 ~5.5 {CustomName:\""); break;
		  case 48: sb.append("~0.8400000000000001 ~0.992 ~0.74 {CustomName:\""); break;
		  case 49: sb.append("~0.8400000000000001 ~0.992 ~5.5 {CustomName:\""); break;
		  case 50: sb.append("~0.8400000000000001 ~1.332 ~0.74 {CustomName:\""); break;
		  case 51: sb.append("~0.8400000000000001 ~1.332 ~5.5 {CustomName:\""); break;
		  case 52: sb.append("~0.8400000000000001 ~1.6720000000000002 ~0.74 {CustomName:\""); break;
		  case 53: sb.append("~0.8400000000000001 ~1.6720000000000002 ~5.5 {CustomName:\""); break;
		  case 54: sb.append("~0.8400000000000001 ~2.012 ~0.74 {CustomName:\""); break;
		  case 55: sb.append("~0.8400000000000001 ~2.012 ~5.5 {CustomName:\""); break;
		  case 56: sb.append("~0.8400000000000001 ~2.3520000000000003 ~0.74 {CustomName:\""); break;
		  case 57: sb.append("~0.8400000000000001 ~2.3520000000000003 ~5.5 {CustomName:\""); break;
		  case 58: sb.append("~0.8400000000000001 ~2.692 ~0.74 {CustomName:\""); break;
		  case 59: sb.append("~0.8400000000000001 ~2.692 ~5.5 {CustomName:\""); break;
		  case 60: sb.append("~0.8400000000000001 ~3.0320000000000005 ~0.74 {CustomName:\""); break;
		  case 61: sb.append("~0.8400000000000001 ~3.0320000000000005 ~5.5 {CustomName:\""); break;
		  case 62: sb.append("~1.1800000000000002 ~0.652 ~1.76 {CustomName:\""); break;
		  case 63: sb.append("~1.1800000000000002 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 64: sb.append("~1.1800000000000002 ~0.652 ~3.46 {CustomName:\""); break;
		  case 65: sb.append("~1.1800000000000002 ~0.652 ~4.48 {CustomName:\""); break;
		  case 66: sb.append("~1.1800000000000002 ~0.652 ~5.84 {CustomName:\""); break;
		  case 67: sb.append("~1.1800000000000002 ~0.992 ~5.84 {CustomName:\""); break;
		  case 68: sb.append("~1.1800000000000002 ~1.332 ~5.84 {CustomName:\""); break;
		  case 69: sb.append("~1.1800000000000002 ~1.6720000000000002 ~5.84 {CustomName:\""); break;
		  case 70: sb.append("~1.1800000000000002 ~2.012 ~5.84 {CustomName:\""); break;
		  case 71: sb.append("~1.1800000000000002 ~2.3520000000000003 ~5.84 {CustomName:\""); break;
		  case 72: sb.append("~1.1800000000000002 ~2.692 ~5.84 {CustomName:\""); break;
		  case 73: sb.append("~1.1800000000000002 ~3.0320000000000005 ~5.84 {CustomName:\""); break;
		  case 74: sb.append("~1.5200000000000002 ~0.652 ~1.4200000000000002 {CustomName:\""); break;
		  case 75: sb.append("~1.5200000000000002 ~0.652 ~1.76 {CustomName:\""); break;
		  case 76: sb.append("~1.5200000000000002 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 77: sb.append("~1.5200000000000002 ~0.652 ~3.46 {CustomName:\""); break;
		  case 78: sb.append("~1.5200000000000002 ~0.652 ~4.48 {CustomName:\""); break;
		  case 79: sb.append("~1.5200000000000002 ~0.652 ~4.82 {CustomName:\""); break;
		  case 80: sb.append("~1.86 ~0.652 ~1.08 {CustomName:\""); break;
		  case 81: sb.append("~1.86 ~0.652 ~1.4200000000000002 {CustomName:\""); break;
		  case 82: sb.append("~1.86 ~0.652 ~1.76 {CustomName:\""); break;
		  case 83: sb.append("~1.86 ~0.652 ~2.1000000000000005 {CustomName:\""); break;
		  case 84: sb.append("~1.86 ~0.652 ~2.4400000000000004 {CustomName:\""); break;
		  case 85: sb.append("~1.86 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 86: sb.append("~1.86 ~0.652 ~3.12 {CustomName:\""); break;
		  case 87: sb.append("~1.86 ~0.652 ~3.46 {CustomName:\""); break;
		  case 88: sb.append("~1.86 ~0.652 ~3.8 {CustomName:\""); break;
		  case 89: sb.append("~1.86 ~0.652 ~4.14 {CustomName:\""); break;
		  case 90: sb.append("~1.86 ~0.652 ~4.48 {CustomName:\""); break;
		  case 91: sb.append("~1.86 ~0.652 ~4.82 {CustomName:\""); break;
		  case 92: sb.append("~1.86 ~0.652 ~5.16 {CustomName:\""); break;
		  case 93: sb.append("~2.2 ~0.652 ~-0.28 {CustomName:\""); break;
		  case 94: sb.append("~2.2 ~0.652 ~1.76 {CustomName:\""); break;
		  case 95: sb.append("~2.2 ~0.652 ~2.1000000000000005 {CustomName:\""); break;
		  case 96: sb.append("~2.2 ~0.652 ~4.14 {CustomName:\""); break;
		  case 97: sb.append("~2.2 ~0.652 ~4.48 {CustomName:\""); break;
		  case 98: sb.append("~2.2 ~0.652 ~6.5200000000000005 {CustomName:\""); break;
		  case 99: sb.append("~2.2 ~0.992 ~-0.28 {CustomName:\""); break;
		  case 100: sb.append("~2.2 ~0.992 ~6.5200000000000005 {CustomName:\""); break;
		  case 101: sb.append("~2.2 ~1.332 ~-0.28 {CustomName:\""); break;
		  case 102: sb.append("~2.2 ~1.332 ~6.5200000000000005 {CustomName:\""); break;
		  case 103: sb.append("~2.2 ~1.6720000000000002 ~-0.28 {CustomName:\""); break;
		  case 104: sb.append("~2.2 ~1.6720000000000002 ~6.5200000000000005 {CustomName:\""); break;
		  case 105: sb.append("~2.2 ~2.012 ~-0.28 {CustomName:\""); break;
		  case 106: sb.append("~2.2 ~2.012 ~6.5200000000000005 {CustomName:\""); break;
		  case 107: sb.append("~2.2 ~2.3520000000000003 ~-0.28 {CustomName:\""); break;
		  case 108: sb.append("~2.2 ~2.3520000000000003 ~6.5200000000000005 {CustomName:\""); break;
		  case 109: sb.append("~2.2 ~2.692 ~-0.28 {CustomName:\""); break;
		  case 110: sb.append("~2.2 ~2.692 ~6.5200000000000005 {CustomName:\""); break;
		  case 111: sb.append("~2.2 ~3.0320000000000005 ~-0.28 {CustomName:\""); break;
		  case 112: sb.append("~2.2 ~3.0320000000000005 ~6.5200000000000005 {CustomName:\""); break;
		  case 113: sb.append("~2.54 ~0.652 ~-0.28 {CustomName:\""); break;
		  case 114: sb.append("~2.54 ~0.652 ~1.76 {CustomName:\""); break;
		  case 115: sb.append("~2.54 ~0.652 ~2.4400000000000004 {CustomName:\""); break;
		  case 116: sb.append("~2.54 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 117: sb.append("~2.54 ~0.652 ~3.12 {CustomName:\""); break;
		  case 118: sb.append("~2.54 ~0.652 ~3.46 {CustomName:\""); break;
		  case 119: sb.append("~2.54 ~0.652 ~3.8 {CustomName:\""); break;
		  case 120: sb.append("~2.54 ~0.652 ~4.48 {CustomName:\""); break;
		  case 121: sb.append("~2.54 ~0.652 ~6.5200000000000005 {CustomName:\""); break;
		  case 122: sb.append("~2.54 ~0.992 ~-0.28 {CustomName:\""); break;
		  case 123: sb.append("~2.54 ~0.992 ~6.5200000000000005 {CustomName:\""); break;
		  case 124: sb.append("~2.54 ~1.332 ~-0.28 {CustomName:\""); break;
		  case 125: sb.append("~2.54 ~1.332 ~3.12 {CustomName:\""); break;
		  case 126: sb.append("~2.54 ~1.332 ~6.5200000000000005 {CustomName:\""); break;
		  case 127: sb.append("~2.54 ~1.6720000000000002 ~-0.28 {CustomName:\""); break;
		  case 128: sb.append("~2.54 ~1.6720000000000002 ~6.5200000000000005 {CustomName:\""); break;
		  case 129: sb.append("~2.54 ~2.012 ~-0.28 {CustomName:\""); break;
		  case 130: sb.append("~2.54 ~2.012 ~6.5200000000000005 {CustomName:\""); break;
		  case 131: sb.append("~2.54 ~2.3520000000000003 ~-0.28 {CustomName:\""); break;
		  case 132: sb.append("~2.54 ~2.3520000000000003 ~6.5200000000000005 {CustomName:\""); break;
		  case 133: sb.append("~2.54 ~2.692 ~-0.28 {CustomName:\""); break;
		  case 134: sb.append("~2.54 ~2.692 ~6.5200000000000005 {CustomName:\""); break;
		  case 135: sb.append("~2.54 ~3.0320000000000005 ~-0.28 {CustomName:\""); break;
		  case 136: sb.append("~2.54 ~3.0320000000000005 ~6.5200000000000005 {CustomName:\""); break;
		  case 137: sb.append("~2.88 ~0.652 ~0.74 {CustomName:\""); break;
		  case 138: sb.append("~2.88 ~0.652 ~1.08 {CustomName:\""); break;
		  case 139: sb.append("~2.88 ~0.652 ~1.4200000000000002 {CustomName:\""); break;
		  case 140: sb.append("~2.88 ~0.652 ~1.76 {CustomName:\""); break;
		  case 141: sb.append("~2.88 ~0.652 ~2.4400000000000004 {CustomName:\""); break;
		  case 142: sb.append("~2.88 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 143: sb.append("~2.88 ~0.652 ~3.12 {CustomName:\""); break;
		  case 144: sb.append("~2.88 ~0.652 ~3.46 {CustomName:\""); break;
		  case 145: sb.append("~2.88 ~0.652 ~3.8 {CustomName:\""); break;
		  case 146: sb.append("~2.88 ~0.652 ~4.48 {CustomName:\""); break;
		  case 147: sb.append("~2.88 ~0.652 ~4.82 {CustomName:\""); break;
		  case 148: sb.append("~2.88 ~0.652 ~5.16 {CustomName:\""); break;
		  case 149: sb.append("~2.88 ~0.652 ~5.5 {CustomName:\""); break;
		  case 150: sb.append("~2.88 ~0.652 ~5.84 {CustomName:\""); break;
		  case 151: sb.append("~2.88 ~0.992 ~3.12 {CustomName:\""); break;
		  case 152: sb.append("~2.88 ~1.332 ~3.12 {CustomName:\""); break;
		  case 153: sb.append("~3.22 ~0.652 ~0.4 {CustomName:\""); break;
		  case 154: sb.append("~3.22 ~0.652 ~1.76 {CustomName:\""); break;
		  case 155: sb.append("~3.22 ~0.652 ~2.4400000000000004 {CustomName:\""); break;
		  case 156: sb.append("~3.22 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 157: sb.append("~3.22 ~0.652 ~3.46 {CustomName:\""); break;
		  case 158: sb.append("~3.22 ~0.652 ~3.8 {CustomName:\""); break;
		  case 159: sb.append("~3.22 ~0.652 ~4.48 {CustomName:\""); break;
		  case 160: sb.append("~3.22 ~0.652 ~5.84 {CustomName:\""); break;
		  case 161: sb.append("~3.22 ~0.652 ~6.180000000000001 {CustomName:\""); break;
		  case 162: sb.append("~3.22 ~0.992 ~2.7800000000000002 {CustomName:\""); break;
		  case 163: sb.append("~3.22 ~0.992 ~3.46 {CustomName:\""); break;
		  case 164: sb.append("~3.22 ~1.332 ~2.4400000000000004 {CustomName:\""); break;
		  case 165: sb.append("~3.22 ~1.332 ~2.7800000000000002 {CustomName:\""); break;
		  case 166: sb.append("~3.22 ~1.332 ~3.46 {CustomName:\""); break;
		  case 167: sb.append("~3.22 ~1.332 ~3.8 {CustomName:\""); break;
		  case 168: sb.append("~3.22 ~1.6720000000000002 ~3.12 {CustomName:\""); break;
		  case 169: sb.append("~3.22 ~2.012 ~3.12 {CustomName:\""); break;
		  case 170: sb.append("~3.56 ~0.652 ~0.74 {CustomName:\""); break;
		  case 171: sb.append("~3.56 ~0.652 ~1.08 {CustomName:\""); break;
		  case 172: sb.append("~3.56 ~0.652 ~1.4200000000000002 {CustomName:\""); break;
		  case 173: sb.append("~3.56 ~0.652 ~1.76 {CustomName:\""); break;
		  case 174: sb.append("~3.56 ~0.652 ~2.4400000000000004 {CustomName:\""); break;
		  case 175: sb.append("~3.56 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 176: sb.append("~3.56 ~0.652 ~3.12 {CustomName:\""); break;
		  case 177: sb.append("~3.56 ~0.652 ~3.46 {CustomName:\""); break;
		  case 178: sb.append("~3.56 ~0.652 ~3.8 {CustomName:\""); break;
		  case 179: sb.append("~3.56 ~0.652 ~4.48 {CustomName:\""); break;
		  case 180: sb.append("~3.56 ~0.652 ~4.82 {CustomName:\""); break;
		  case 181: sb.append("~3.56 ~0.652 ~5.16 {CustomName:\""); break;
		  case 182: sb.append("~3.56 ~0.652 ~5.5 {CustomName:\""); break;
		  case 183: sb.append("~3.56 ~0.652 ~5.84 {CustomName:\""); break;
		  case 184: sb.append("~3.56 ~0.992 ~3.12 {CustomName:\""); break;
		  case 185: sb.append("~3.56 ~1.332 ~3.12 {CustomName:\""); break;
		  case 186: sb.append("~3.9 ~0.652 ~-0.28 {CustomName:\""); break;
		  case 187: sb.append("~3.9 ~0.652 ~1.76 {CustomName:\""); break;
		  case 188: sb.append("~3.9 ~0.652 ~2.4400000000000004 {CustomName:\""); break;
		  case 189: sb.append("~3.9 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 190: sb.append("~3.9 ~0.652 ~3.12 {CustomName:\""); break;
		  case 191: sb.append("~3.9 ~0.652 ~3.46 {CustomName:\""); break;
		  case 192: sb.append("~3.9 ~0.652 ~3.8 {CustomName:\""); break;
		  case 193: sb.append("~3.9 ~0.652 ~4.48 {CustomName:\""); break;
		  case 194: sb.append("~3.9 ~0.652 ~6.5200000000000005 {CustomName:\""); break;
		  case 195: sb.append("~3.9 ~0.992 ~-0.28 {CustomName:\""); break;
		  case 196: sb.append("~3.9 ~0.992 ~6.5200000000000005 {CustomName:\""); break;
		  case 197: sb.append("~3.9 ~1.332 ~-0.28 {CustomName:\""); break;
		  case 198: sb.append("~3.9 ~1.332 ~3.12 {CustomName:\""); break;
		  case 199: sb.append("~3.9 ~1.332 ~6.5200000000000005 {CustomName:\""); break;
		  case 200: sb.append("~3.9 ~1.6720000000000002 ~-0.28 {CustomName:\""); break;
		  case 201: sb.append("~3.9 ~1.6720000000000002 ~6.5200000000000005 {CustomName:\""); break;
		  case 202: sb.append("~3.9 ~2.012 ~-0.28 {CustomName:\""); break;
		  case 203: sb.append("~3.9 ~2.012 ~6.5200000000000005 {CustomName:\""); break;
		  case 204: sb.append("~3.9 ~2.3520000000000003 ~-0.28 {CustomName:\""); break;
		  case 205: sb.append("~3.9 ~2.3520000000000003 ~6.5200000000000005 {CustomName:\""); break;
		  case 206: sb.append("~3.9 ~2.692 ~-0.28 {CustomName:\""); break;
		  case 207: sb.append("~3.9 ~2.692 ~6.5200000000000005 {CustomName:\""); break;
		  case 208: sb.append("~3.9 ~3.0320000000000005 ~-0.28 {CustomName:\""); break;
		  case 209: sb.append("~3.9 ~3.0320000000000005 ~6.5200000000000005 {CustomName:\""); break;
		  case 210: sb.append("~4.24 ~0.652 ~-0.28 {CustomName:\""); break;
		  case 211: sb.append("~4.24 ~0.652 ~1.76 {CustomName:\""); break;
		  case 212: sb.append("~4.24 ~0.652 ~2.1000000000000005 {CustomName:\""); break;
		  case 213: sb.append("~4.24 ~0.652 ~4.14 {CustomName:\""); break;
		  case 214: sb.append("~4.24 ~0.652 ~4.48 {CustomName:\""); break;
		  case 215: sb.append("~4.24 ~0.652 ~6.5200000000000005 {CustomName:\""); break;
		  case 216: sb.append("~4.24 ~0.992 ~-0.28 {CustomName:\""); break;
		  case 217: sb.append("~4.24 ~0.992 ~6.5200000000000005 {CustomName:\""); break;
		  case 218: sb.append("~4.24 ~1.332 ~-0.28 {CustomName:\""); break;
		  case 219: sb.append("~4.24 ~1.332 ~6.5200000000000005 {CustomName:\""); break;
		  case 220: sb.append("~4.24 ~1.6720000000000002 ~-0.28 {CustomName:\""); break;
		  case 221: sb.append("~4.24 ~1.6720000000000002 ~6.5200000000000005 {CustomName:\""); break;
		  case 222: sb.append("~4.24 ~2.012 ~-0.28 {CustomName:\""); break;
		  case 223: sb.append("~4.24 ~2.012 ~6.5200000000000005 {CustomName:\""); break;
		  case 224: sb.append("~4.24 ~2.3520000000000003 ~-0.28 {CustomName:\""); break;
		  case 225: sb.append("~4.24 ~2.3520000000000003 ~6.5200000000000005 {CustomName:\""); break;
		  case 226: sb.append("~4.24 ~2.692 ~-0.28 {CustomName:\""); break;
		  case 227: sb.append("~4.24 ~2.692 ~6.5200000000000005 {CustomName:\""); break;
		  case 228: sb.append("~4.24 ~3.0320000000000005 ~-0.28 {CustomName:\""); break;
		  case 229: sb.append("~4.24 ~3.0320000000000005 ~6.5200000000000005 {CustomName:\""); break;
		  case 230: sb.append("~4.580000000000001 ~0.652 ~1.08 {CustomName:\""); break;
		  case 231: sb.append("~4.580000000000001 ~0.652 ~1.4200000000000002 {CustomName:\""); break;
		  case 232: sb.append("~4.580000000000001 ~0.652 ~1.76 {CustomName:\""); break;
		  case 233: sb.append("~4.580000000000001 ~0.652 ~2.1000000000000005 {CustomName:\""); break;
		  case 234: sb.append("~4.580000000000001 ~0.652 ~2.4400000000000004 {CustomName:\""); break;
		  case 235: sb.append("~4.580000000000001 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 236: sb.append("~4.580000000000001 ~0.652 ~3.12 {CustomName:\""); break;
		  case 237: sb.append("~4.580000000000001 ~0.652 ~3.46 {CustomName:\""); break;
		  case 238: sb.append("~4.580000000000001 ~0.652 ~3.8 {CustomName:\""); break;
		  case 239: sb.append("~4.580000000000001 ~0.652 ~4.14 {CustomName:\""); break;
		  case 240: sb.append("~4.580000000000001 ~0.652 ~4.48 {CustomName:\""); break;
		  case 241: sb.append("~4.580000000000001 ~0.652 ~4.82 {CustomName:\""); break;
		  case 242: sb.append("~4.580000000000001 ~0.652 ~5.16 {CustomName:\""); break;
		  case 243: sb.append("~4.920000000000001 ~0.652 ~1.4200000000000002 {CustomName:\""); break;
		  case 244: sb.append("~4.920000000000001 ~0.652 ~1.76 {CustomName:\""); break;
		  case 245: sb.append("~4.920000000000001 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 246: sb.append("~4.920000000000001 ~0.652 ~3.46 {CustomName:\""); break;
		  case 247: sb.append("~4.920000000000001 ~0.652 ~4.48 {CustomName:\""); break;
		  case 248: sb.append("~4.920000000000001 ~0.652 ~4.82 {CustomName:\""); break;
		  case 249: sb.append("~5.260000000000001 ~0.652 ~0.4 {CustomName:\""); break;
		  case 250: sb.append("~5.260000000000001 ~0.652 ~1.76 {CustomName:\""); break;
		  case 251: sb.append("~5.260000000000001 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 252: sb.append("~5.260000000000001 ~0.652 ~3.46 {CustomName:\""); break;
		  case 253: sb.append("~5.260000000000001 ~0.652 ~4.48 {CustomName:\""); break;
		  case 254: sb.append("~5.260000000000001 ~0.992 ~0.4 {CustomName:\""); break;
		  case 255: sb.append("~5.260000000000001 ~1.332 ~0.4 {CustomName:\""); break;
		  case 256: sb.append("~5.260000000000001 ~1.6720000000000002 ~0.4 {CustomName:\""); break;
		  case 257: sb.append("~5.260000000000001 ~2.012 ~0.4 {CustomName:\""); break;
		  case 258: sb.append("~5.260000000000001 ~2.3520000000000003 ~0.4 {CustomName:\""); break;
		  case 259: sb.append("~5.260000000000001 ~2.692 ~0.4 {CustomName:\""); break;
		  case 260: sb.append("~5.260000000000001 ~3.0320000000000005 ~0.4 {CustomName:\""); break;
		  case 261: sb.append("~5.6000000000000005 ~0.652 ~0.74 {CustomName:\""); break;
		  case 262: sb.append("~5.6000000000000005 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 263: sb.append("~5.6000000000000005 ~0.652 ~3.46 {CustomName:\""); break;
		  case 264: sb.append("~5.6000000000000005 ~0.652 ~5.5 {CustomName:\""); break;
		  case 265: sb.append("~5.6000000000000005 ~0.992 ~0.74 {CustomName:\""); break;
		  case 266: sb.append("~5.6000000000000005 ~0.992 ~5.5 {CustomName:\""); break;
		  case 267: sb.append("~5.6000000000000005 ~1.332 ~0.74 {CustomName:\""); break;
		  case 268: sb.append("~5.6000000000000005 ~1.332 ~5.5 {CustomName:\""); break;
		  case 269: sb.append("~5.6000000000000005 ~1.6720000000000002 ~0.74 {CustomName:\""); break;
		  case 270: sb.append("~5.6000000000000005 ~1.6720000000000002 ~5.5 {CustomName:\""); break;
		  case 271: sb.append("~5.6000000000000005 ~2.012 ~0.74 {CustomName:\""); break;
		  case 272: sb.append("~5.6000000000000005 ~2.012 ~5.5 {CustomName:\""); break;
		  case 273: sb.append("~5.6000000000000005 ~2.3520000000000003 ~0.74 {CustomName:\""); break;
		  case 274: sb.append("~5.6000000000000005 ~2.3520000000000003 ~5.5 {CustomName:\""); break;
		  case 275: sb.append("~5.6000000000000005 ~2.692 ~0.74 {CustomName:\""); break;
		  case 276: sb.append("~5.6000000000000005 ~2.692 ~5.5 {CustomName:\""); break;
		  case 277: sb.append("~5.6000000000000005 ~3.0320000000000005 ~0.74 {CustomName:\""); break;
		  case 278: sb.append("~5.6000000000000005 ~3.0320000000000005 ~5.5 {CustomName:\""); break;
		  case 279: sb.append("~5.94 ~0.652 ~2.7800000000000002 {CustomName:\""); break;
		  case 280: sb.append("~5.94 ~0.652 ~3.12 {CustomName:\""); break;
		  case 281: sb.append("~5.94 ~0.652 ~3.46 {CustomName:\""); break;
		  case 282: sb.append("~5.94 ~0.652 ~5.16 {CustomName:\""); break;
		  case 283: sb.append("~5.94 ~0.992 ~5.16 {CustomName:\""); break;
		  case 284: sb.append("~5.94 ~1.332 ~5.16 {CustomName:\""); break;
		  case 285: sb.append("~5.94 ~1.6720000000000002 ~5.16 {CustomName:\""); break;
		  case 286: sb.append("~5.94 ~2.012 ~5.16 {CustomName:\""); break;
		  case 287: sb.append("~5.94 ~2.3520000000000003 ~5.16 {CustomName:\""); break;
		  case 288: sb.append("~5.94 ~2.692 ~5.16 {CustomName:\""); break;
		  case 289: sb.append("~5.94 ~3.0320000000000005 ~5.16 {CustomName:\""); break;
		  case 290: sb.append("~6.280000000000001 ~0.652 ~3.12 {CustomName:\""); break;
		  case 291: sb.append("~6.620000000000001 ~0.652 ~2.1000000000000005 {CustomName:\""); break;
		  case 292: sb.append("~6.620000000000001 ~0.652 ~2.4400000000000004 {CustomName:\""); break;
		  case 293: sb.append("~6.620000000000001 ~0.652 ~3.8 {CustomName:\""); break;
		  case 294: sb.append("~6.620000000000001 ~0.652 ~4.14 {CustomName:\""); break;
		  case 295: sb.append("~6.620000000000001 ~0.992 ~2.1000000000000005 {CustomName:\""); break;
		  case 296: sb.append("~6.620000000000001 ~0.992 ~2.4400000000000004 {CustomName:\""); break;
		  case 297: sb.append("~6.620000000000001 ~0.992 ~3.8 {CustomName:\""); break;
		  case 298: sb.append("~6.620000000000001 ~0.992 ~4.14 {CustomName:\""); break;
		  case 299: sb.append("~6.620000000000001 ~1.332 ~2.1000000000000005 {CustomName:\""); break;
		  case 300: sb.append("~6.620000000000001 ~1.332 ~2.4400000000000004 {CustomName:\""); break;
		  case 301: sb.append("~6.620000000000001 ~1.332 ~3.8 {CustomName:\""); break;
		  case 302: sb.append("~6.620000000000001 ~1.332 ~4.14 {CustomName:\""); break;
		  case 303: sb.append("~6.620000000000001 ~1.6720000000000002 ~2.1000000000000005 {CustomName:\""); break;
		  case 304: sb.append("~6.620000000000001 ~1.6720000000000002 ~2.4400000000000004 {CustomName:\""); break;
		  case 305: sb.append("~6.620000000000001 ~1.6720000000000002 ~3.8 {CustomName:\""); break;
		  case 306: sb.append("~6.620000000000001 ~1.6720000000000002 ~4.14 {CustomName:\""); break;
		  case 307: sb.append("~6.620000000000001 ~2.012 ~2.1000000000000005 {CustomName:\""); break;
		  case 308: sb.append("~6.620000000000001 ~2.012 ~2.4400000000000004 {CustomName:\""); break;
		  case 309: sb.append("~6.620000000000001 ~2.012 ~3.8 {CustomName:\""); break;
		  case 310: sb.append("~6.620000000000001 ~2.012 ~4.14 {CustomName:\""); break;
		  case 311: sb.append("~6.620000000000001 ~2.3520000000000003 ~2.1000000000000005 {CustomName:\""); break;
		  case 312: sb.append("~6.620000000000001 ~2.3520000000000003 ~2.4400000000000004 {CustomName:\""); break;
		  case 313: sb.append("~6.620000000000001 ~2.3520000000000003 ~3.8 {CustomName:\""); break;
		  case 314: sb.append("~6.620000000000001 ~2.3520000000000003 ~4.14 {CustomName:\""); break;
		  case 315: sb.append("~6.620000000000001 ~2.692 ~2.1000000000000005 {CustomName:\""); break;
		  case 316: sb.append("~6.620000000000001 ~2.692 ~2.4400000000000004 {CustomName:\""); break;
		  case 317: sb.append("~6.620000000000001 ~2.692 ~3.8 {CustomName:\""); break;
		  case 318: sb.append("~6.620000000000001 ~2.692 ~4.14 {CustomName:\""); break;
		  case 319: sb.append("~6.620000000000001 ~3.0320000000000005 ~2.1000000000000005 {CustomName:\""); break;
		  case 320: sb.append("~6.620000000000001 ~3.0320000000000005 ~2.4400000000000004 {CustomName:\""); break;
		  case 321: sb.append("~6.620000000000001 ~3.0320000000000005 ~3.8 {CustomName:\""); break;
		  case 322: sb.append("~6.620000000000001 ~3.0320000000000005 ~4.14 {CustomName:\""); break;
		}
		sb.append(structureCode);
		sb.append(stoneSuffix);
		return sb.toString();
	}
}