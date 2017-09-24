'use strict';
import {
    NativeModules
} from 'react-native'
var RNPreferenceAndroid = require('NativeModules').RNPreferenceAndroid;
module.exports = {
    set:function(key,value){
        RNPreferenceAndroid.set(key,value);
    },
    get:function(key){
        return RNPreferenceAndroid.get(key);
    }
};