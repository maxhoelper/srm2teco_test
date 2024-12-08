package mbpp_588_big_diff;

public class mbpp_588_big_diff {

    
    public static int bigDiff_Problem_2_c25950a2_4e07_48c2_9f5e_9c1323fbc01b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e1cdd047_c9ad_43a1_b20f_b11b777183b2(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_c335b374_492f_45ea_8c5b_c75ee6845f38(ArrayList<Integer> nums) {
        int max = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int min = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        int diff = (max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_2_dbf9f226_ec3e_4926_ac1f_d79db5f7e5da(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_135a70bc_520c_48a6_aa5d_1288c0b978e8(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7a154236_fc24_42d7_a87d_e2a026e6dcbc(ArrayList<Integer> nums) {
        if(nums.isEmpty()){
            return 0;
        }
        Integer diff = nums.get(0);
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for (Integer value : nums) {
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
            if (diff > Math.abs(max - min)) {
                diff = Math.abs(max - min);
            }
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_f3a991f8_4fc6_42f2_b98c_52d1dcffe342(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_4644e759_5d81_4673_a434_a6474aaa93e3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5d70bbe9_fec6_4d8d_ba8d_825dc6771a45(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a60dbf23_6c09_4cf1_98fe_c3660cd3d187(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f6363a37_adde_4de2_849a_d3db82d201c9(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d6ec2d4f_f613_4870_b7fe_6c10ca97eedc(ArrayList<Integer> nums) {
        return nums.stream().mapToInteger(a -> a - nums.get(0)).max().orElse(0) - nums.get(0) - nums.get(nums.size() - 1);
    }

    
    public static int bigDiff_Problem_1_557d5252_32d9_4e62_a1fc_6e9d19248216(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_51ad7422_dd8c_471e_8d3b_91a2db44dd5c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1552876b_6b31_4b9f_b9fe_37e838e048fd(ArrayList<Integer> nums) {
        Collections.sort(nums);
        Integer first = nums.get(0);
        Integer last = nums.get(nums.size() - 1);
        return last - first;
    }

    
    public static int bigDiff_Problem_1_baa1acb6_51da_41e9_be3e_362140813d36(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer l : nums) {
            max = Math.max(max, l);
            min = Math.min(min, l);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_2_e4e1308d_6dbd_48ad_ba0c_15cb51015fe3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_dd469ebc_9278_446b_b5b2_a40010d53b44(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_fcef4b05_f6db_4f7f_93a0_e2212837db40(ArrayList<Integer> nums) {
        Integer max = nums.stream().max(Integer::compare).get();
        Integer min = nums.stream().min(Integer::compare).get();
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_0_45fb57ac_c6dc_42d2_ad61_fb5b2c5f910b(ArrayList<Integer> nums) {
        int result = nums.stream().map(x -> Math.abs(x)).reduce(Math::max).get();
        return result - nums.stream().map(x -> Math.abs(x)).reduce(Math::min).get();
    }

    
    public static int bigDiff_Problem_2_2e453c0e_f489_4bcf_b586_0492348e101a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int number:nums) {
            if(number > largest)
                largest = number;
            if(number < smallest)
                smallest = number;
        }
        return smallest - largest;
    }

    
    public static int bigDiff_Problem_0_3ab3a7fb_cd3b_4ec6_a060_f154d9cf3aed(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_cf9593c8_c683_4cb3_9352_37d81b0479df(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1ed17f36_23a3_47dc_b8a1_7caf146bd124(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_baa1acb6_51da_41e9_be3e_362140813d36(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer l : nums) {
            max = Math.max(max, l);
            min = Math.min(min, l);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_20f3674c_9cfe_49cd_87de_f552e96a8592(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_d622370a_939f_4df6_90c7_0d461820d73d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5ed9cd70_a63a_4a78_92b3_66e39d3890c2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1e9e761f_9fcc_4da9_b53c_bcf38f25ac94(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_203b3435_0d86_4df7_99d8_f50ee775aa13(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_43941432_6bb2_4f13_9e84_092f1eeab5f0(ArrayList<Integer> nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e131800e_09c8_4438_bd53_17f36a132f07(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for(int n: nums) {
            if(n > max)
                max = n;
            else if(n < min)
                min = n;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_66e1f9c8_02d9_47cf_b532_dbe99581a494(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b7f30c38_783f_4025_847a_4b8742dfc49d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_021578db_8544_44c2_b816_1731808b550a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_902bf292_27c6_4fe3_abae_f260fb71dc8d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_393a544c_af5b_4b4c_8b22_fe595c76025a(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_60f2af68_c953_464b_8748_dad678d5257b(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_1370c7df_15fb_4f06_810a_a4e2d8b24bb6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e1468c0e_4bca_4d84_a4db_44dae4d8f97e(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_23462d66_1ea4_47c4_a6fd_50c90a497d41(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0899a4eb_b78f_4ade_94ca_16df055733df(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_74846cf6_7135_4fd3_b64f_eeb3b25cb0e4(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f96711a7_7bd9_4181_b952_bf0c2651599a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_731f977f_0eec_4a46_9338_cb98ff9bfbfd(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_bcac2721_1541_41c7_82de_cc7118a66bd0(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_023a4bac_277f_4649_8913_b9126d813570(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_43941432_6bb2_4f13_9e84_092f1eeab5f0(ArrayList<Integer> nums) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5d1d4d79_87ed_4ae0_8a14_936dde95e3c6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_86d98449_1b66_4c75_81f8_ca5a60472033(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_12f951c5_9289_45ed_ac91_75c7b1381ef2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0a358233_6308_4e94_a1a4_ad5b9d16b22b(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_9918668a_375c_4285_9798_97db343bb90b(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_9bda672c_9d25_4548_ad6a_b887ac7149c1(ArrayList<Integer> nums) {
        return nums.get(0).compareTo(nums.get(nums.size() - 1));
    }

    
    public static int bigDiff_Problem_1_6040ff0a_9802_400b_a2f7_bcfbe1ae3095(ArrayList<Integer> nums) {
        int[] array = new int[nums.size()];
        int i = 0;
        for(int number : nums) {
            array[i] = number;
            i++;
        }
        Arrays.sort(array);
        return array[array.length - 1] - array[0];
    }

    
    public static int bigDiff_Problem_0_557d5252_32d9_4e62_a1fc_6e9d19248216(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_0_16c5aec8_6092_4ed8_b083_550f3eeafa11(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c6cf6066_b4cb_42a9_8359_935dbdf75f68(ArrayList<Integer> nums) {
        int max_num = Integer.MIN_VALUE;
        int min_num = Integer.MAX_VALUE;
        for (int number : nums) {
            if (number > max_num) {
                max_num = number;
            }
            if (number < min_num) {
                min_num = number;
            }
        }
        return max_num - min_num;
    }

    
    public static int bigDiff_Problem_1_4c70c506_8b0e_4493_942d_2b19a00e9384(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_00f266b0_5b2b_47e9_b2f0_73502b703bc9(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f7e95b7e_1967_4ded_8438_1e35b233f665(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return (max-min);
    }

    
    public static int bigDiff_Problem_0_830d5200_e52a_4b5f_af83_da0e05a2c9cb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e68fcf5a_26b7_4aa6_abe0_e2dfcf2db572(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5d992e3a_ce86_48b9_92e0_a91628d0a5be(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_11df6865_7f5d_4c9c_9253_93cd6c5c7eef(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_63354e34_309d_4849_a77d_f83afc3733f2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2733f0f5_3f08_41c1_acbb_d18be7ec601f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_52d7f9bd_a0a6_4016_8aa8_7cfad59d494c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(Integer l : nums) {
            max = Math.max(max,l);
            min = Math.min(min,l);
        }
        return Math.abs(max-min);
    }

    
    public static int bigDiff_Problem_2_212dc00f_41b6_4ffc_ae8b_e0ca4cc89587(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_aa91f6c3_ed15_4f66_a9e6_da52755b6114(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_9b8f4d6b_541a_47f8_93a1_93d293e13f29(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for(int value: nums) {
            if(value > max) {
                max = value;
            }
            if(value < min) {
                min = value;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_af9a1733_284b_4682_a748_8a9fa7c89ea1(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0c931ebd_c09d_4afc_bfd4_820cebe4c89f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_6d4ab201_4e17_4591_9eaf_a570c4ee06fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f227f2e2_c793_4439_bbd4_b91e59c53e80(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b2fef31c_6e88_4991_833e_3b504ca33a9d(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i : nums) {
            if (i > largest) {
                largest = i;
            }
            if (i < smallest) {
                smallest = i;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_2525bcae_7fa3_4c29_8932_bc36ec0492fb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_00702adf_2491_4d3b_a129_c954c23cb593(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d95fa8c5_33d7_42e9_89a8_f2d4cf4d04d7(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int res = 0;
        int temp = 0;
        for(int n: nums) {
            if(n > max) max = n;
            if(n < min) min = n;
        }
        for(int n: nums) {
            temp = Math.abs(n - max);
            res = Math.max(res, temp);
        }
        return res;
    }

    
    public static int bigDiff_Problem_2_d9df1633_4e72_4c2a_9040_df31181c1b9d(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_b0eeb3b2_8336_4311_878e_674418f79d3b(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fe24be79_8b50_4468_af8b_9df26dd0d9d6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_aef2613c_fa09_4e2f_9307_4fbe5045700d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a9fb45d1_0050_4c87_af40_e9eee105a4bd(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_2_6f13c225_0af8_4704_9064_63367d7ba153(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_7a9da6d6_b52b_47d7_8b23_a45d097f00e0(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_347e8ad5_0e95_43cc_a942_a54933a0ffd9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_601a233f_ab5c_455f_b57f_2eaad142ab84(ArrayList<Integer> nums) {
        // Complete this function
        int diff = Integer.MAX_VALUE;
        Collections.sort(nums);
        return diff;
    }

    
    public static int bigDiff_Problem_2_f47f7475_f30c_45bb_bb5e_d92c478f2daa(ArrayList<Integer> nums) {
        return nums.stream().max(Integer::compare).map(Integer::intValue).orElse(-1L) - nums.stream().min(Integer::compare).map(Integer::intValue).orElse(0L);
    }

    
    public static int bigDiff_Problem_2_54dfcd60_5082_4ef0_b5f9_13b0682966b5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bd805d9b_16bc_4abd_bd20_1381bd94303f(ArrayList<Integer> nums) {
        int max = 0, min = nums.get(0);
        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max)
                max = nums.get(i);
            if(nums.get(i) < min)
                min = nums.get(i);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8a676e0e_b4ab_4552_93ca_8f159591850c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c4604e0f_fb32_472c_800e_d5a1ce74149a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_6e2e207c_2bd2_41fb_901d_65beddf89add(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9b8f4d6b_541a_47f8_93a1_93d293e13f29(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for(int value: nums) {
            if(value > max) {
                max = value;
            }
            if(value < min) {
                min = value;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e6747ed4_00bd_4a68_bad0_d5f3c4eab2aa(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7cefb45f_855e_4821_bff8_d427c4e22f2d(ArrayList<Integer> nums) {
        int min = nums.get(0), max = nums.get(0);
        for (Integer num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e3032d84_9342_4863_957e_d418a126f019(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_3cc7fa7d_ebac_4329_ab55_74db3e4f221d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_1eec90de_396a_4420_8307_9d183afd8b24(ArrayList<Integer> nums) {
        if (nums.size() == 0) {
            return 0;
        }
        int len = nums.size();
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < len; i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        int diff = Math.abs(max - min);
        for (int i = 0; i < len; i++) {
            int curr = nums.get(i);
            if (diff < Math.abs(max - curr)) {
                diff = Math.abs(max - curr);
            }
            if (diff < Math.abs(curr - min)) {
                diff = Math.abs(curr - min);
            }
        }
        return diff;
    }

    
    public static int bigDiff_Problem_1_ef935ad4_136b_4b79_bea0_327225b02de1(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_57ee18ff_4102_46bd_b32f_f036482e63c9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_aca10976_7bfe_465a_9886_2f7148409530(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_1_fe7602b8_1e5f_4c46_94ec_ef932b6e64f3(ArrayList<Integer> nums) {
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_1_933e0da1_5605_43b5_ad3a_09ba29a90155(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_debebea5_a2b6_42a8_a9d5_eb0ad0fb312e(ArrayList<Integer> nums) {
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        for (Integer num: nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_493f56a7_fe14_4da5_80ea_88ab10c42194(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_62b5689b_077f_449a_b36a_a9ee065adb7f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer x : nums) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_2_62b5689b_077f_449a_b36a_a9ee065adb7f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer x : nums) {
            max = Math.max(max, x);
            min = Math.min(min, x);
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_2_c8fb3d5d_10fd_4b31_95de_157eb4693b77(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a2c5e373_35a7_432f_b209_08866cba1d0d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b736eaa4_82b0_4f93_95a3_c730b8d229b4(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_ed05724c_1e54_4f0d_87a3_63f17cdcf719(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_5f530433_307f_4539_96e6_77e9071e7b33(ArrayList<Integer> nums) {
        int max1 = 0;
        int max2 = 0;
        int min1 = 0;
        int min2 = 0;
        for(Integer n: nums) {
            if(n > max1) {
                max2 = max1;
                max1 = n;
            }
            if(n > max2) {
                max2 = n;
            }
            if(n < min1) {
                min2 = min1;
                min1 = n;
            }
            if(n < min2) {
                min2 = n;
            }
        }
        return Math.abs(max1 - min1) > Math.abs(max2 - min2)? Math.abs(max1 - min1): Math.abs(max2 - min2);
    }

    
    public static int bigDiff_Problem_2_32a930af_0030_4e30_9047_913cf1e4673c(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7abd5821_3f15_40bb_b3dc_559f4b589cc6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_04b58911_15ad_4205_bfcc_0506a0b1e5b7(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6a51a8e7_3703_43d1_a15d_df8488ac8e4e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_347e8ad5_0e95_43cc_a942_a54933a0ffd9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_631f48f7_45c5_43ef_8fe5_b716a01464b4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_279d8ad0_5daa_47f0_8eac_de370ddf1b35(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_f59246bf_acaf_4a2a_afe2_866419e3b95d(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f718d836_a174_4f20_ac34_e24f7488ab5a(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6aa6e378_d90d_4bec_a4fd_88047eb00753(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_583fc34f_655f_4d2f_9eeb_7b771d1dface(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_96726e67_2be8_49b6_b1da_e5e3362bffcd(ArrayList<Integer> nums) {
        Integer result = nums.get(0);
        for (Integer val : nums) {
            if (result < val) {
                result = val;
            } else {
                result = Math.abs(result - val);
            }
        }
        return result;
    }

    
    public static int bigDiff_Problem_0_12f951c5_9289_45ed_ac91_75c7b1381ef2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f1e0adf7_1614_4f70_81fc_01371f26dddf(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7a154236_fc24_42d7_a87d_e2a026e6dcbc(ArrayList<Integer> nums) {
        if(nums.isEmpty()){
            return 0;
        }
        Integer diff = nums.get(0);
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for (Integer value : nums) {
            if (value > max) {
                max = value;
            } else if (value < min) {
                min = value;
            }
            if (diff > Math.abs(max - min)) {
                diff = Math.abs(max - min);
            }
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_e793a56f_4238_4e22_8c8b_7ff6d058b4f6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_583fc34f_655f_4d2f_9eeb_7b771d1dface(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7cf4840e_6070_411a_b531_b07c0e5a873e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f19333b7_264a_4f7e_9e69_2265a3f125ac(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bb797338_2f43_4007_a107_30feccbebf97(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_bb3849b3_9031_493e_b516_9c336bf1e5db(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_755261bc_1b0c_4312_9a4c_f5588213d2df(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_8c68d14a_752a_400e_b48a_5123d7dd103e(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_39dc0b11_d737_4e97_a358_b1b687b70cc0(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, diff = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (min > num) {
                min = num;
            }
            if (max < num) {
                max = num;
            }
            diff = Math.abs(max - min);
        }
        return diff;
    }

    
    public static int bigDiff_Problem_0_88175872_92c3_451a_a058_31c5ab076835(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_6f13c225_0af8_4704_9064_63367d7ba153(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_73e3eb72_4cea_4b13_a277_468f02db2fe2(ArrayList<Integer> nums) {
        int bigger = 0, smaller = 0;
        for (int num : nums)
            if (num > bigger) bigger = num;
            else if (num < smaller) smaller = num;
        int diff = (bigger - smaller);
        return diff;
    }

    
    public static int bigDiff_Problem_0_e8e0cd63_138b_41d9_bf78_0c877c9853e0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_347e8ad5_0e95_43cc_a942_a54933a0ffd9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c8167b1b_3bfc_49d2_ae8c_7c7a320989dd(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1c00d2ba_d81c_4ec7_8287_bf4fe0e99129(ArrayList<Integer> nums) {
        int max_val = Integer.MIN_VALUE;
        int min_val = Integer.MAX_VALUE;
        int big = Integer.MAX_VALUE;
        int small = Integer.MIN_VALUE;

        for(Integer num : nums) {
            if(num > max_val) {
                max_val = num;
            }

            if(num < min_val) {
                min_val = num;
            }

            if(num > big) {
                big = num;
            }

            if(num < small) {
                small = num;
            }
        }

        return small - max_val;
    }

    
    public static int bigDiff_Problem_2_11e65bde_c5e8_4c7d_a350_aa9ba9e85837(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_a60dbf23_6c09_4cf1_98fe_c3660cd3d187(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_7717d67a_c554_4afe_8903_d651acdcc02f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_74cdcbbb_f889_424a_a974_7e55ffee3960(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_cadc7447_a5a5_4dae_9b06_12c062fa308b(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c7805acd_897d_44d7_8a9b_6055a97f1a88(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_cfb25f91_ab54_4239_8093_239105128787(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_0c04973c_b02c_447d_b5dc_40bd2b3acc35(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_6cd44374_0ba3_4039_a884_ea4c150e140e(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_92139994_0c15_42ed_81d9_735e99911879(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_35ffc1f6_287e_4928_85c2_651a66be9b64(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            if (n < min) {
                min = n;
            }
            if (n > max) {
                max = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a18d04c3_6b5c_4f30_bd2c_87ca173a003d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_b67e175e_9d98_4f10_92f6_7e4f2063e513(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4bd28907_194d_4578_be57_d1e8694d94ef(ArrayList<Integer> nums) {
        int max = Collections.max(nums);
        int min = Collections.min(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_2_63c61b8a_8e0b_469f_84cc_7f6acdaf14ad(ArrayList<Integer> nums) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_24ccc2f5_5688_4024_b535_39d26b33fa3a(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_023b8473_2cf6_4429_91d6_9f4fe75bd0f5(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_469b22a0_68de_4b62_a137_d3df0aa08bc2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_9c971a10_16d2_4d8c_8ce1_c7cf18980bc6(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a1c91fab_5c30_441c_bef8_dcaf7011cc6c(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_996c76f2_aa62_4923_9871_9c9d49615a79(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0c04973c_b02c_447d_b5dc_40bd2b3acc35(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_c45115b5_0848_4ec3_bc6c_13d1dd21fdbb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_fad85ea5_4582_4cc9_a601_13039f7c31c8(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_496c65a5_8dac_4096_9644_ba477818ab95(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_a1604620_dc8a_48c4_be6c_d05449858cc9(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_34335840_62f8_4493_8961_b99dd61921ab(ArrayList<Integer> nums) {
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for(int i : nums) {
            if(i>maxNum) {
                maxNum = i;
            }
            if(i<minNum) {
                minNum = i;
            }
        }
        return maxNum-minNum;
    }

    
    public static int bigDiff_Problem_2_9bda672c_9d25_4548_ad6a_b887ac7149c1(ArrayList<Integer> nums) {
        return nums.get(0).compareTo(nums.get(nums.size() - 1));
    }

    
    public static int bigDiff_Problem_1_75c437a6_8690_411f_aa93_965f399f15ac(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (max < num) max = num;
            if (min > num) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_2e453c0e_f489_4bcf_b586_0492348e101a(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int number:nums) {
            if(number > largest)
                largest = number;
            if(number < smallest)
                smallest = number;
        }
        return smallest - largest;
    }

    
    public static int bigDiff_Problem_2_f1422f16_b74b_4706_b462_78dfa68b61db(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_5c3b3505_c627_4bf6_b36b_aa54c6ac7226(ArrayList<Integer> nums) {
        return nums.stream().max((a, b) -> a.compareTo(b)).get() - nums.stream().min((a, b) -> a.compareTo(b)).get();
    }

    
    public static int bigDiff_Problem_2_c23b2a4e_78f0_4f07_bd71_a92a1fd1643c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_830d5200_e52a_4b5f_af83_da0e05a2c9cb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f47aaed3_0d0e_40ba_92ca_535912a3a9d2(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (Integer num : nums) {
            if (num < min) {
                min = num;
            } else if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9844d669_38fd_4605_b1a7_17ffcab217a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_05320ae7_3be5_4f4e_bc8e_cc0ee7cd9e85(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_11caf3e5_cbe3_43e2_aaa0_5513d03332db(ArrayList<Integer> nums) {
        Integer[] arr = nums.stream().sorted().toArray(Integer[]::new);
        return arr[arr.length-1]-arr[0];
    }

    
    public static int bigDiff_Problem_1_2bbb4817_0ba6_41ca_8f10_82db035932af(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4c592d54_61d4_4863_a197_a7b1a9b32956(ArrayList<Integer> nums) {
        Collections.sort(nums);
        if (nums.size() <= 1) {
            return 0;
        }
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_19552657_5ee5_435d_afa6_5c522de74088(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9d44aa58_a1d2_463a_96d2_791b505ffffd(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_2525bcae_7fa3_4c29_8932_bc36ec0492fb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c9387ee3_68ec_4750_b655_29bc21a8aa97(ArrayList<Integer> nums) {
        int max = 0;
        int min = 0;
        for (Integer i : nums) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_90d77e5b_468a_462d_ba23_f68598858c5d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_962de037_8522_465e_8db8_ec611dd58fdb(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_6d4ab201_4e17_4591_9eaf_a570c4ee06fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_11df6865_7f5d_4c9c_9253_93cd6c5c7eef(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_92139994_0c15_42ed_81d9_735e99911879(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e5d351c0_13c6_4e91_9b65_689b4e26fdb0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_c8781559_6834_465d_a2c0_be5c5049f4fe(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f59246bf_acaf_4a2a_afe2_866419e3b95d(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_19714b02_79e9_49eb_8c7a_257bc3940cb0(ArrayList<Integer> nums) {
        int max_val = Collections.max(nums);
        int min_val = Collections.min(nums);
        return max_val - min_val;
    }

    
    public static int bigDiff_Problem_0_a5cdab70_cd2a_4431_9696_b0c2ef58d01c(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7cefb45f_855e_4821_bff8_d427c4e22f2d(ArrayList<Integer> nums) {
        int min = nums.get(0), max = nums.get(0);
        for (Integer num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_d622370a_939f_4df6_90c7_0d461820d73d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fa6feebc_76a0_4f6c_a14f_fcf71bc8b4f3(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ad384323_b5f0_4e3a_b911_0951c6df1127(ArrayList<Integer> nums) {
        if(nums.size() == 0)
            return 0;
        int pos = 0;
        Integer min = nums.get(0);
        Integer max = nums.get(0);
        for(Integer num : nums){
            if(num < min){
                min = num;
                pos = nums.indexOf(num);
            }
            if(num > max){
                max = num;
                pos = nums.indexOf(num);
            }
        }
        return nums.get(pos).intValue() - nums.get(nums.size() - 1).intValue();
    }

    
    public static int bigDiff_Problem_1_2c4a70a8_6ffb_4168_b8c3_8bbbf3348a60(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_4c592d54_61d4_4863_a197_a7b1a9b32956(ArrayList<Integer> nums) {
        Collections.sort(nums);
        if (nums.size() <= 1) {
            return 0;
        }
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_2_4c592d54_61d4_4863_a197_a7b1a9b32956(ArrayList<Integer> nums) {
        Collections.sort(nums);
        if (nums.size() <= 1) {
            return 0;
        }
        return nums.get(nums.size() - 1) - nums.get(0);
    }

    
    public static int bigDiff_Problem_1_05c22697_4d51_4f84_809e_27753c7af6a2(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, res;
        for(Integer n : nums) {
            if(min > n) {
                min = n;
            }
            if(max < n) {
                max = n;
            }
        }
        res = max - min;
        return res;
    }

    
    public static int bigDiff_Problem_0_daa2afa9_f547_42c7_b61f_a19fb04d6918(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_cb2acb6d_6f15_4397_a939_18b09c06d07f(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_962de037_8522_465e_8db8_ec611dd58fdb(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_be124fbe_ffef_4d8e_a7ef_886768ec30ed(ArrayList<Integer> nums) {
        if(nums == null || nums.isEmpty())
            return 0;
        int min = nums.stream().min(Integer::compare).get();
        int max = nums.stream().max(Integer::compare).get();
        return max - min;
    }

    
    public static int bigDiff_Problem_1_05320ae7_3be5_4f4e_bc8e_cc0ee7cd9e85(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1a6c40c5_38ba_42a2_bd8d_7b710cdd120c(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_1fb9aa6d_c8cb_4731_a919_ef22b959afca(ArrayList<Integer> nums) {
        int largest = nums.get(0); // Initialize largest to first element.
        int smallest = nums.get(0); // Initialize smallest to first element.
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_c4ac92e3_f7ba_45cc_8fca_40d9dffb2d76(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer n : nums) {
            max = Math.max(n, max);
            min = Math.min(n, min);
        }
        return Math.abs(max - min);
    }

    
    public static int bigDiff_Problem_1_7f00a296_4b2f_4f7a_ad70_c9110403d76b(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_40dad8e8_be60_4b3c_8125_4bf460a794e6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_60f051c9_6b06_457c_9431_0aba89b94b15(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_fe29a6c5_3ab1_4675_8533_fa2386645399(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_577432ed_2065_46c2_acaa_2d0a9209c429(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a8f39498_a037_404d_9199_cd550c7d166b(ArrayList<Integer> nums) {
        int max = nums.stream().mapToInteger(i -> i).max().getAsInteger();
        int min = nums.stream().mapToInteger(i -> i).min().getAsInteger();
        int diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_dfbfc6f4_7b7b_44c6_b4b3_42fbdd4e9615(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_20bcfd8b_e7ca_4709_9e3c_fe1946046359(ArrayList<Integer> nums) {
        return nums.stream().max(Integer::compare).get() - nums.stream().min(Integer::compare).get();
    }

    
    public static int bigDiff_Problem_1_135a70bc_520c_48a6_aa5d_1288c0b978e8(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_b9ffc2e0_8220_4b7d_b3d3_01f844489a8f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_fc8ff7ae_34a9_4408_8de5_2cbad0100942(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ccc34bb7_873d_4688_937e_5452bdf82c8d(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_de791e13_5645_4f6e_85f9_54e92607e514(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8c9e36e1_2d8e_49a3_8118_22c34c984c3e(ArrayList<Integer> nums) {
        int max = 0, min = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        int temp = max - min;
        if (temp < 0) {
            return 0;
        }
        return temp;
    }

    
    public static int bigDiff_Problem_0_9c971a10_16d2_4d8c_8ce1_c7cf18980bc6(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_3ab3a7fb_cd3b_4ec6_a060_f154d9cf3aed(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_a6984dea_8239_4227_b16e_98fa6b23ccd5(ArrayList<Integer> nums) {
        int largest = nums.stream().max(Integer::compareTo).get();
        int smallest = nums.stream().min(Integer::compareTo).get();
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_be61246e_c655_4e4c_81bb_c5dc5809bde8(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_da73ab2b_8cec_4b6a_bd23_50639aaa760f(ArrayList<Integer> nums) {
        if(nums.size() == 1) {
            return 0L;
        }
        if(nums.size() == 2) {
            return Math.abs(nums.get(0) - nums.get(1));
        }
        int a = nums.get(0);
        int b = nums.get(1);
        int c = nums.get(2);
        return Math.max(Math.max(a, b), c);
    }

    
    public static int bigDiff_Problem_0_a3090edc_698d_463b_9d03_a90ea6859680(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_f47f7475_f30c_45bb_bb5e_d92c478f2daa(ArrayList<Integer> nums) {
        return nums.stream().max(Integer::compare).map(Integer::intValue).orElse(-1L) - nums.stream().min(Integer::compare).map(Integer::intValue).orElse(0L);
    }

    
    public static int bigDiff_Problem_1_4e6f3155_c6c7_445b_a6be_32bea250778f(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_387630f5_e5c7_4e2b_9a84_eea3bf4b9707(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_ebddeb8e_4d14_4f2e_8b77_79647684eb27(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_990a3a36_d7ef_4732_8b10_40b507d06c0a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0d81f006_628c_4320_8fb1_50ffb868af0c(ArrayList<Integer> nums) {
        int n = nums.size();
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 1; i < n; i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            } else if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        int diff = Math.abs(max - min);
        return diff;
    }

    
    public static int bigDiff_Problem_0_8a4de2fd_8958_4bbf_ae44_c841980f5bcb(ArrayList<Integer> nums) {
        if(nums.size() == 0) return 0;
        int result = nums.get(0);
        for(int l : nums) {
            result = Math.max(result, l);
        }
        for(int l : nums) {
            result = Math.min(result, l);
        }
        return result;
    }

    
    public static int bigDiff_Problem_1_7bfb3692_004d_4007_80b5_c7113b71b450(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++) {
            if(nums.get(i) > max) {
                max = nums.get(i);
            }
            if(nums.get(i) < min) {
                min = nums.get(i);
            }
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_2_be61246e_c655_4e4c_81bb_c5dc5809bde8(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_0_e8a19c60_02db_42dd_bfca_8afb50e4ff2e(ArrayList<Integer> nums) {
        int min = Collections.min(nums);
        int max = Collections.max(nums);
        return max - min;
    }

    
    public static int bigDiff_Problem_1_0d1d79b6_c2a0_4f28_8889_9a0394146d19(ArrayList<Integer> nums) {
        int largest = nums.get(0);
        int smallest = nums.get(0);
        for(int num : nums) {
            if(num > largest) {
                largest = num;
            }
            if(num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_5a246187_8ba3_4aca_a80f_cfd578ccb4d9(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_88600a4f_65b0_4fb2_b964_aea3c94d19f3(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_40dad8e8_be60_4b3c_8125_4bf460a794e6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_199bb711_efbe_4f09_8605_041bdc1fdf0b(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7c0b3b1d_1c61_46ab_8916_defd2ef677bb(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7957f3f5_a2e9_4c7e_b282_1ec203a09d82(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n : nums) {
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_ca5d1014_0d1e_4692_b473_edee3483a701(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1d71d3d7_9ce4_4220_9cec_f76878bc7dc5(ArrayList<Integer> nums) {
        if(nums.isEmpty()) throw new IllegalArgumentException("array list is empty");
        int maxValue = nums.get(0);
        int minValue = nums.get(0);
        int diff;
        for(Integer num : nums) {
            if(num > maxValue) {
                maxValue = num;
            }
            if(num < minValue) {
                minValue = num;
            }
        }
        diff = maxValue - minValue;
        return diff;
    }

    
    public static int bigDiff_Problem_0_a36936dd_20d0_44de_86cd_ad1573545fc4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_65fd38f5_a334_4114_b78b_96ea0fed086a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_847e9889_3bbd_4235_a20b_e4113165bbda(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_8dc470a5_0c65_4552_be85_65ea67bcdb9d(ArrayList<Integer> nums) {
        int size = nums.size();
        int min = nums.get(0);
        int max = nums.get(0);
        for(int i=0; i<size; i++) {
            int val = nums.get(i);
            if(val > max) {
                max = val;
            }
            if(val < min) {
                min = val;
            }
        }
        int diff = max - min;
        for(int i=0; i<size; i++) {
            int val = nums.get(i);
            if(val < min) {
                min = val;
            }
            if(val > max) {
                max = val;
            }
        }
        diff = max - min;
        return diff;
    }

    
    public static int bigDiff_Problem_1_11bafd1f_0b38_4b62_9ae2_0d463c350418(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_eac69f9e_a776_4bc9_a7fb_c1726b6cedb8(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e793a56f_4238_4e22_8c8b_7ff6d058b4f6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_6f13c225_0af8_4704_9064_63367d7ba153(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0); // initialize smallest to first element
        for (int num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_c322e800_b410_46b5_89c7_614ea60fcc42(ArrayList<Integer> nums) {
        int largest = nums.get(0); 
        int smallest = nums.get(0); 
        for(int i = 1; i < nums.size(); i++) {
            int diff = nums.get(i) - nums.get(i - 1);
            if(diff > largest) {
                largest = diff;
            }
            if(diff < smallest) {
                smallest = diff;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_1_c4e0dcf5_1a50_4093_aff3_c9f2c485de48(ArrayList<Integer> nums) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int each : nums) {
            largest = Math.max(each, largest);
            smallest = Math.min(each, smallest);
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_dbb4308a_bdcc_4c84_a248_4d0ff35245a0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_94ecc46c_4e85_4af4_8706_ec6a8d2a1d69(ArrayList<Integer> nums) {
        int largest = Collections.max(nums).intValue();
        int smallest = Collections.min(nums).intValue();
        return (largest - smallest);
    }

    
    public static int bigDiff_Problem_1_609511b6_e9c3_42a8_8180_c33b300357bf(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_23d9b51a_d335_45b7_881b_812de58c870f(ArrayList<Integer> nums) {
        int l = nums.get(0);
        int r = nums.get(0);
        for(int i = 0;i<nums.size();i++) {
            if(nums.get(i)>r) r = nums.get(i);
            if(nums.get(i)<l) l = nums.get(i);
        }
        return r-l;
    }

    
    public static int bigDiff_Problem_1_41ce3ef0_af52_4c0a_a100_1c19af79b6cb(ArrayList<Integer> nums) {
        // Find the largest and smallest value in the array.
        int largest = nums.get(0); // Set largest to first element in array.
        int smallest = nums.get(0); // Set smallest to first element in array.
        for (int num : nums) {
            // If current number is smaller than the smallest number, then make it smallest.
            if (num < smallest) {
                smallest = num;
            }
            // Else if current number is greater than the largest number, then make it largest.
            else if (num > largest) {
                largest = num;
            }
        }
        // Return the difference between the largest and smallest numbers in array.
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_98cb8af3_d9e0_4989_9041_c44ff229efdc(ArrayList<Integer> nums) {
        int biggest = nums.get(0); 
        int smallest = nums.get(0);
        for (int i=1; i<nums.size(); i++) {
            if (nums.get(i)>biggest) { biggest=nums.get(i); }
            if (nums.get(i)<smallest) { smallest=nums.get(i); }
        }
        return biggest-smallest;
    }

    
    public static int bigDiff_Problem_0_a39b077d_e84a_49e6_87a0_bc081a797dbe(ArrayList<Integer> nums) {
        Integer[] temp = nums.toArray(new Integer[nums.size()]);
        Integer[] temp1 = nums.toArray(new Integer[nums.size()]);
        Arrays.sort(temp);
        Arrays.sort(temp1);
        return Math.abs(temp[temp.length - 1] - temp1[0]);
    }

    
    public static int bigDiff_Problem_1_63c61b8a_8e0b_469f_84cc_7f6acdaf14ad(ArrayList<Integer> nums) {
        // Write your code here
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_09caceca_b56e_4b68_abd2_80f220309fa1(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_845426d8_17ee_4b35_9bd6_1730ee44f3ea(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_9ee492cf_55c7_4183_8823_e08d125c241a(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_f4cd0225_0034_40a3_b695_b61b8a73d9d0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_78ffffc2_a04d_4c06_864e_d75f943a81f5(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element of array
        int smallest = nums.get(0); // initialize smallest to first element of array
        for (Integer num : nums) {
            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_ca5d1014_0d1e_4692_b473_edee3483a701(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_2c8a9c3a_8faf_4804_b8bc_a6f9aa72bd58(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_7b11e969_d989_4c05_96e1_af4ad28df916(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_577432ed_2065_46c2_acaa_2d0a9209c429(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_93c7057c_b643_4e6f_ac8a_1d3dadbd5ee6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_45fb57ac_c6dc_42d2_ad61_fb5b2c5f910b(ArrayList<Integer> nums) {
        int result = nums.stream().map(x -> Math.abs(x)).reduce(Math::max).get();
        return result - nums.stream().map(x -> Math.abs(x)).reduce(Math::min).get();
    }

    
    public static int bigDiff_Problem_2_fc0a7b28_5767_42ed_9208_eb576d636b1e(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_dcef1694_18cc_4031_8d43_82b6f5557a39(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_60f051c9_6b06_457c_9431_0aba89b94b15(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_fc834724_617e_4bc4_a80a_a953ba036bbb(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for(int i = 1; i < nums.size(); i++) {
            if(nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if(nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_0_eaba583d_5a6a_4a4f_8d08_4012c1fcefda(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e07fe78f_a1cd_47e7_ab9b_7b8ee9dcf76b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c25950a2_4e07_48c2_9f5e_9c1323fbc01b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int num : nums) {
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_19714b02_79e9_49eb_8c7a_257bc3940cb0(ArrayList<Integer> nums) {
        int max_val = Collections.max(nums);
        int min_val = Collections.min(nums);
        return max_val - min_val;
    }

    
    public static int bigDiff_Problem_2_f7807077_fbb9_41b5_8e61_7c96b2b48163(ArrayList<Integer> nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int n: nums) {
            if (n < min) min = n;
            if (n > max) max = n;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_7abd5821_3f15_40bb_b3dc_559f4b589cc6(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_aa4dccbd_ea6d_4045_81e3_3d6001f6e915(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_ef935ad4_136b_4b79_bea0_327225b02de1(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_eaba583d_5a6a_4a4f_8d08_4012c1fcefda(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0b87843e_a01a_4084_9b19_52720478fbbd(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_943ad178_2296_4e2d_9606_400241fefc60(ArrayList<Integer> nums) {
        int max = nums.get(0);
        int min = nums.get(0);
        for (int n : nums) {
            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_11df6865_7f5d_4c9c_9253_93cd6c5c7eef(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_4e8529bd_0aae_42b2_8975_6cce76e5aaa9(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_0a358233_6308_4e94_a1a4_ad5b9d16b22b(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_3f24bdbc_5df9_4ad8_bfdc_2e46daf83354(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_21c39b38_5bee_4d29_a68d_9e6dabc674ec(ArrayList<Integer> nums) {
        Integer[] array = new Integer[nums.size()];
        nums.toArray(array);
        Arrays.sort(array);
        Integer biggest = array[array.length - 1];
        Integer smallest = array[0];
        Integer diff = biggest - smallest;
        return diff;
    }

    
    public static int bigDiff_Problem_0_6ffd1e26_5dfc_4269_8042_120c28931d35(ArrayList<Integer> nums) {
        int max = 0L;
        int min = 0L;
        for(int num: nums) {
            if(num > max)
                max = num;
            if(num < min)
                min = num;
        }
        return max-min;
    }

    
    public static int bigDiff_Problem_1_e96de7d8_49ee_42ff_b2ee_62c7b6804dfe(ArrayList<Integer> nums) {
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        Arrays.sort(arr);
        if (arr.length == 0) {
            return 0;
        }
        return arr[arr.length - 1] - arr[0];
    }

    
    public static int bigDiff_Problem_1_fb6c6c9c_e850_4401_850f_0f652e54fd05(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_c322e800_b410_46b5_89c7_614ea60fcc42(ArrayList<Integer> nums) {
        int largest = nums.get(0); 
        int smallest = nums.get(0); 
        for(int i = 1; i < nums.size(); i++) {
            int diff = nums.get(i) - nums.get(i - 1);
            if(diff > largest) {
                largest = diff;
            }
            if(diff < smallest) {
                smallest = diff;
            }
        }
        return largest - smallest;
    }

    
    public static int bigDiff_Problem_2_aa4dccbd_ea6d_4045_81e3_3d6001f6e915(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_95464e24_2e2a_40eb_8ab9_3f1060a162b7(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_e96de7d8_49ee_42ff_b2ee_62c7b6804dfe(ArrayList<Integer> nums) {
        Integer[] arr = nums.toArray(new Integer[nums.size()]);
        Arrays.sort(arr);
        if (arr.length == 0) {
            return 0;
        }
        return arr[arr.length - 1] - arr[0];
    }

    
    public static int bigDiff_Problem_2_469b22a0_68de_4b62_a137_d3df0aa08bc2(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > max) max = num;
            if (num < min) min = num;
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_82a3f25f_4706_411e_9f8d_8a9a39319e69(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_26ec624f_408a_4da0_92e5_e9300f597a45(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_1106629c_ddc5_4bda_8412_82732565b1d4(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_a7098506_f744_49f3_bb67_8ca01ce7a53a(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_5dcf6798_ab33_472d_86f4_43910ec0a630(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_1_e041b161_780e_482e_b8ac_2a0c143a7eaa(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (Integer num : nums) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_c8167b1b_3bfc_49d2_ae8c_7c7a320989dd(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(Integer num : nums) {
            if(num > max) {
                max = num;
            }
            if(num < min) {
                min = num;
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_51351371_610b_44f0_845d_03244d847c3b(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for(int i = 0; i < nums.size(); i++){
            if(nums.get(i) > max) max = nums.get(i);
            if(nums.get(i) < min) min = nums.get(i);
        }

        return max - min;
    }

    
    public static int bigDiff_Problem_2_3670dd4a_82a8_4aff_8afd_32430944fb36(ArrayList<Integer> nums) {
        Integer l = nums.stream().mapToInteger(Integer::intValue).min().getAsInteger();
        Integer h = nums.stream().mapToInteger(Integer::intValue).max().getAsInteger();
        int diff =  Math.abs(h - l);
        return diff;
    }

    
    public static int bigDiff_Problem_2_37ff5605_56c0_4a8b_b28f_7017a018e54e(ArrayList<Integer> nums) {
        int min = nums.get(0);
        int max = nums.get(0);
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) < min) {
                min = nums.get(i);
            }
            if (nums.get(i) > max) {
                max = nums.get(i);
            }
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_e6be56af_b064_4651_836b_b24fefdb048e(ArrayList<Integer> nums) {
        return Collections.max(nums) - Collections.min(nums);
    }

    
    public static int bigDiff_Problem_1_ed05724c_1e54_4f0d_87a3_63f17cdcf719(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int n : nums) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_0_96726e67_2be8_49b6_b1da_e5e3362bffcd(ArrayList<Integer> nums) {
        Integer result = nums.get(0);
        for (Integer val : nums) {
            if (result < val) {
                result = val;
            } else {
                result = Math.abs(result - val);
            }
        }
        return result;
    }

    
    public static int bigDiff_Problem_2_021f883d_6b36_403d_a16f_69b2c0d5f2d0(ArrayList<Integer> nums) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.size(); i++) {
            max = Math.max(max, nums.get(i));
            min = Math.min(min, nums.get(i));
        }
        return max - min;
    }

    
    public static int bigDiff_Problem_2_684309b4_0f31_497d_92ca_ed5802077423(ArrayList<Integer> nums) {
        int largest = nums.get(0); // initialize largest to first element
        int smallest = nums.get(0);
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i) > largest) {
                largest = nums.get(i);
            }
            if (nums.get(i) < smallest) {
                smallest = nums.get(i);
            }
        }
        return largest - smallest;
    }

}