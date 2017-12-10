import React, { Component } from 'react';
import {
  Image,
  View,
  ScrollView,
} from 'react-native';
import {
  Container,
  Header,
  Title,
  Content,
  Icon,
  Button,
  Left,
  Right,
  Body,
  Text,
  Card,
  CardItem,
  List,
  ListItem,
  Item,
  Input,
  Radio,
  Picker,
  Form,
} from 'native-base';
import { NavigationActions } from 'react-navigation';

const navBack = NavigationActions.back();

class SegundaPantalla extends Component {
  static navigationOptions = {
    header: null,
  }

  render() {
    return (
      <Container>
        <Header>
          <Left style={{ flex: 1 }} />
          <Body style={{ flex: 6 }}>
            <Title>Segunda Pantalla</Title>
          </Body>
          <Right style={{ flex: 1 }}>
            <Button transparent>
              <Icon name="menu" />
            </Button>
          </Right>
        </Header>
        <Content scrollEnabled={false} style={{ flex: 1 }} contentContainerStyle={{ flex: 1 }}>
          <View style={{ flex: 12 }}>
          </View>
        </Content>
      </Container>
    );
  }
}

export default SegundaPantalla;
