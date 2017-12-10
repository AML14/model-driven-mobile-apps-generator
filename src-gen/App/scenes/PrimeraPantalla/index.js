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

class PrimeraPantalla extends Component {
  static navigationOptions = {
    header: null,
  }

  render() {
    return (
      <Container>
        <Header>
          <Left style={{ flex: 1 }} />
          <Body style={{ flex: 6 }}>
            <Title>Primera Pantalla</Title>
          </Body>
          <Right style={{ flex: 1 }}>
            <Button transparent>
              <Icon name="menu" />
            </Button>
          </Right>
        </Header>
        <Content scrollEnabled={false} style={{ flex: 1 }} contentContainerStyle={{ flex: 1 }}>
          <View style={{ flex: 12 }}>
            <View style={{
                flex: '2.0',
                flexDirection: 'row',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
            </View>
            <View style={{
                flex: '2.0',
                flexDirection: 'row',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
            </View>
            <View style={{ flex: '2.0', flexDirection: 'row' }}>
            <View style={{
                flex: '3.0',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
            </View>
            <View style={{
                flex: '1.0',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
            </View>
            </View>
            <View style={{
                flex: '6.0',
                flexDirection: 'row',
                justifyContent: 'center',
                alignItems: 'center',
              }}
            >
            </View>
          </View>
        </Content>
      </Container>
    );
  }
}

export default PrimeraPantalla;
