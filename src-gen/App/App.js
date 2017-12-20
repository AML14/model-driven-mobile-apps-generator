import React, { Component } from 'react';
import { Platform } from 'react-native';
import { StackNavigator, TabNavigator } from 'react-navigation';

import FirstScreen from './scenes/FirstScreen';
import SecondScreen from './scenes/SecondScreen';
import ThirdScreen from './scenes/ThirdScreen';

const tabBarOptions = (Platform.OS === 'android') ?
  {
    style: { backgroundColor: '#303F9F' },
    indicatorStyle: { backgroundColor: '#FF4081' },
  } :
  {};

const tabNavigatorConfig = {
  backBehavior: 'none',
  tabBarPosition: 'bottom',
  tabBarOptions,
};

const Navegador1 = StackNavigator(
  {
    FirstScreen: { screen: FirstScreen },
    SecondScreen: { screen: SecondScreen },
    ThirdScreen: { screen: ThirdScreen },
  },
  {
    initialRouteName: 'FirstScreen',
  },
);

export default class App extends Component {
  render() {
    return (
      <Navegador1 />
    );
  }
}


