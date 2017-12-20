import React, { Component } from 'react';
import {
  Image,
  View,
  ScrollView,
  AsyncStorage,
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
  Label,
} from 'native-base';
import { NavigationActions } from 'react-navigation';

const navBack = NavigationActions.back();

class ThirdScreen extends Component {
  static navigationOptions = {
    header: null,
  }
  
  constructor(props) {
    super(props);
    this.initialState = {
    };
    this.state = this.initialState;
  }
  
  componentDidMount() {
  }
  
  // eslint-disable-next-line class-methods-use-this
  async getInputValue(a) {
    let a1 = null;
    if (a !== null) {
      if (a.type !== 'login') {
        a1 = await AsyncStorage.getItem(a.key);
      } else {
        a1 = `${await AsyncStorage.getItem(a.key.split('-')[0])}-${await AsyncStorage.getItem(a.key.split('-')[1])}`;
      }
    }
    return a1;
  }
  
  getInputParams(a, b = null, c = null, d = null, e = null) {
    const a1 = this.getInputValue(a);
    const b1 = this.getInputValue(b);
    const c1 = this.getInputValue(c);
    const d1 = this.getInputValue(d);
    const e1 = this.getInputValue(e);
    return {
      a1,
      b1,
      c1,
      d1,
      e1,
    };
  }

  loadCardContentFromExternalSource(a, b, c, d, e) {
    const {
      a1,
      b1,
      c1,
      d1,
      e1,
    } = this.getInputParams(a, b, c, d, e);
    /**
     * Code for retrieving information from an external source using the params passed.
     * The external source could be a server, for instance, which could perform
     * different operations depending on the params' (a1, b1, c1, d1, e1) type and value.
     */
    return (
      <Card>
        <CardItem header>
          <Text>Card example</Text>
        </CardItem>
        <CardItem>
          <Body>
            <Text>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam
              eleifend leo non felis tristique, ac ullamcorper velit accumsan.
              Sed vitae leo ut urna porta laoreet. Praesent in imperdiet sem,
              ut rhoncus lacus. Praesent ultricies quis purus a euismod.
            </Text>
          </Body>
        </CardItem>
      </Card>
    );
  }
  
  loadListContentFromExternalSource(a, b, c, d, e) {
    const {
      a1,
      b1,
      c1,
      d1,
      e1,
    } = this.getInputParams(a, b, c, d, e);
    /**
     * Code for retrieving information from an external source using the params passed.
     * The external source could be a server, for instance, which could perform
     * different operations depending on the params' (a1, b1, c1, d1, e1) type and value.
     */
    return (
      <ScrollView>
        {/* Las listas deben marcar flex=1 dentro de la vista */}
        <List style={{ flex: 1 }}>
          <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
            <Left style={{ flex: 1 }}>
              <Icon name="information-circle" style={{ color: '#157EFB' }} />
            </Left>
            <Body style={{ flex: 8 }}>
              <Text numberOfLines={1}>Simon Mignolet</Text>
            </Body>
            <Right style={{ flex: 1 }}>
              <Icon name="arrow-forward" />
            </Right>
          </ListItem>
          <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
            <Left style={{ flex: 1 }}>
              <Icon name="information-circle" style={{ color: '#157EFB' }} />
            </Left>
            <Body style={{ flex: 8 }}>
              <Text numberOfLines={1}>Nathaniel Clyne</Text>
            </Body>
            <Right style={{ flex: 1 }}>
              <Icon name="arrow-forward" />
            </Right>
          </ListItem>
          <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
            <Left style={{ flex: 1 }}>
              <Icon name="information-circle" style={{ color: '#157EFB' }} />
            </Left>
            <Body style={{ flex: 8 }}>
              <Text numberOfLines={1}>Dejan Lovren</Text>
            </Body>
            <Right style={{ flex: 1 }}>
              <Icon name="arrow-forward" />
            </Right>
          </ListItem>
        </List>
      </ScrollView>
    );
  }

  render() {
    return (
      <Container>
        <Header>
          <Left style={{ flex: 1 }}>
            <Button transparent onPress={() => this.props.navigation.dispatch(navBack)}>
              <Icon name="arrow-back" />
            </Button>
          </Left>
          <Body style={{ flex: 6 }}>
            <Title>Third Screen</Title>
          </Body>
          <Right style={{ flex: 1 }}>
          </Right>
        </Header>
        <Content>
          <View style={{
              flex: 1,
              flexDirection: 'row',
              justifyContent: 'center',
              alignItems: 'center',
              margin: 0,
              padding: 0,
            }}
          >
              {this.loadCardContentFromExternalSource(
                {
                  type: 'login',
                  key: 'username1-password1',
                },
                {
                  type: 'inputText',
                  key: 'inputText2',
                },
                {
                  type: 'inputText',
                  key: 'inputText4',
                },
                {
                  type: 'radioButton',
                  key: 'radioButton3',
                },
                {
                  type: 'itemSelected',
                  key: 'itemSelected5',
                },
              )}
          </View>
        </Content>
      </Container>
    );
  }
}

export default ThirdScreen;
